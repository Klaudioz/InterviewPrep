package codekata.nameinverter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Klaudioz on 03-Aug-16.
 */
public class NameInverterTest {
    @Test(expected = NullPointerException.class)
    public void invertNullShouldThrowNullPointerException() {
        NameInverter.invert(null);
    }

    @Test
    public void invertEmptyStringShouldReturnEmptyString() {
        assertThat(NameInverter.invert(""), is(""));
        assertThat(NameInverter.invert("    "), is(""));
    }
    
    @Test
    public void invertFirstNameShouldReturnFirstName() {
        assertThat(NameInverter.invert("Claudio"), is("Claudio"));
        assertThat(NameInverter.invert("  Claudio   "), is("Claudio"));
    }
}
