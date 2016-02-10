package gojava.test;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import gojava.module09.CaesarCipher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class CaesarCipherTest {

    private static final String TEMP_FILE_NAME = "temp.txt";

    @Test(timeout = 1000)
    public void testEncode() throws Exception {
        assertEquals("cde", CaesarCipher.encode("ABC", 2));
    }

    @Test(timeout = 1000)
    public void testDecode() throws Exception {
        assertEquals("abc", CaesarCipher.decode("CDE", 2));
    }

    @Test(timeout = 1000)
    public void testEncodeToFile() throws Exception {
        String text = "sometext";
        String fileName = "ciphertext.txt";
        int key = 18;

        CaesarCipher.encodeToFile(text, key, fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            assertEquals(CaesarCipher.encode(text, key), br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Before
    public void setUp() throws Exception {
        String plainText = "sometext";
        int key = 9;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(TEMP_FILE_NAME))) {
            bw.write(CaesarCipher.encode(plainText, key));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test(timeout = 1000)
    public void testDecodeFromFile() throws Exception {

        assertEquals("sometext", CaesarCipher.decodeFromFile(TEMP_FILE_NAME, 9));
    }

    @After
    public void tearDown() throws Exception {

        File file = new File(TEMP_FILE_NAME);
        try {
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}