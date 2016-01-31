package gojava.test;

import gojava.module09.CaesarCipher;
import org.junit.Assert;
import org.junit.Test;

public class CaesarCipherTest {

    @Test
    public void testEncode() throws Exception {
        Assert.assertEquals("cde", CaesarCipher.encode("ABC", 2));
    }

    @Test
    public void testDecode() throws Exception {
        Assert.assertEquals("abc", CaesarCipher.decode("CDE", 2));
    }
}