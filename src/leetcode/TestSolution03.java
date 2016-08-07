package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Klaudioz on 06-Aug-16.
 */
public class TestSolution03 {
    @Test
    public void TestWhenStringEmpty(){
        assertThat(Solution03.lengthOfLongestSubstring(""), is(0));
    }
    @Test
    public void TestWhenStringHasOneChar(){
        assertThat(Solution03.lengthOfLongestSubstring("a"), is(1));
    }
    @Test
    public void TestWhenStringHasUniqueChar(){
        assertThat(Solution03.lengthOfLongestSubstring("abcd"), is(4));
    }
    @Test
    public void TestWhenStringHasSameChar(){
        assertThat(Solution03.lengthOfLongestSubstring("aaaa"), is(1));
    }
    @Test
    public void TestWhenLongestAtMostLeft(){
        assertThat(Solution03.lengthOfLongestSubstring("abca"), is(3));
    }
    @Test
    public void TestWhenLongestAtMostRight(){
        assertThat(Solution03.lengthOfLongestSubstring("aab"), is(2));
    }
    @Test
    public void TestWhenLongestAtMostCenter(){ assertThat(Solution03.lengthOfLongestSubstring("ababcba"), is(3));}
}
