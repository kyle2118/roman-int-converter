package converter;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest {
    private RomanToIntConverter converter = new RomanToIntConverter();

    @Test
    public void RomainToInt() {
        Assert.assertEquals(115, converter.convert("CXV"));
        Assert.assertEquals(3, converter.convert("III"));
        Assert.assertEquals(4, converter.convert("IV"));
        Assert.assertEquals(40, converter.convert("XL"));
        Assert.assertEquals(58, converter.convert("LVIII"));
        Assert.assertEquals(398, converter.convert("CCCXCVIII"));
        Assert.assertEquals(543, converter.convert("DXLIII"));
        Assert.assertEquals(1666, converter.convert("MDCLXVI"));
        Assert.assertEquals(1994, converter.convert("MCMXCIV"));
        Assert.assertEquals(2019, converter.convert("MMXIX"));
    }
}
