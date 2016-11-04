package Hackerrank;

import java.util.HashMap;
import java.util.Map;

public class PatternMatching {

    public static void main(String[] args) {
        System.out.println(isMatched("abba","redbluebluered"));
        System.out.println(isMatched("abba","redredredred"));
        System.out.println(isMatched("ab","redred"));
    }

    public static boolean isMatched(String pattern, String input) {
        return isMatchedRecur(pattern.toCharArray(), 0, input.toCharArray(), 0, new HashMap<Character, String>());
    }

    private static boolean isMatchedRecur(char[] pattern, int startPattern, char[] input, int startInput, Map<Character, String> definition) {
        boolean finishedPattern = startPattern >= pattern.length;
        boolean finishedInput = startInput >= input.length;
        if (finishedInput && finishedPattern)
            return true;
        else if (finishedInput ^ finishedPattern)
            return false;
        char nextPatternChar = pattern[startPattern];
        //if the next character in pattern is already defined, check its definition as prefix of the input
        if (definition.containsKey(nextPatternChar)) {
            String charDef = definition.get(nextPatternChar);
            if (startInput + charDef.length() - 1 >= input.length)
                return false;
            for (int i = 0; i < charDef.length(); i++)
                if (charDef.charAt(i) != input[startInput + i])
                    return false;
            return isMatchedRecur(pattern, startPattern + 1, input, startInput + charDef.length(), definition);
        }
        else {
            StringBuilder builder = new StringBuilder();
            //try all possible definition of the current character in the pattern
            for (int i = startInput; i < input.length; i++) {
                builder.append(input[i]);
                String newDef = builder.toString();
                //make sure the definition is distinct
                if (!definition.containsValue(newDef)) {
                    definition.put(nextPatternChar, newDef);
                    boolean isMatch = isMatchedRecur(pattern, startPattern + 1,input, startInput + newDef.length(), definition);
                    if (isMatch)
                        return true;
                    definition.remove(nextPatternChar);
                }
            }
            return false;
        }
    }
}