package methods;

/**
 * Created by Klaudioz on 06-Aug-16.
 */
public class StringMethods {
    public static String capitalizeEven(String s) {
        char[] cs = s.toCharArray();
        for (int i = 2; i < cs.length; i *= 2)
            cs[i-1] = Character.toUpperCase(cs[i-1]);
        return new String(cs);
    }
}
