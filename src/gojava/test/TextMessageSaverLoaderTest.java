package gojava.test;

import gojava.module09.CaesarCipher;
import gojava.module10.TextMessageSaverLoader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class TextMessageSaverLoaderTest {

    private static final String TEMP_FILE_NAME = "temp.txt";

    @Test(timeout = 1000)
    public void saveAsPlainText() throws Exception {
        String text = "abcdefghijk";
        String fileName = "plaintext.txt";

        TextMessageSaverLoader.saveAsPlainText(text, fileName);

        File file = new File(fileName);
        assertTrue(file.exists());

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            assertEquals(br.readLine(), text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test(timeout = 1000)
    public void saveAsCipherText() throws Exception {
        int key = 7;
        String plainText = "abcdefghijklmnopqrstuvwxyz";
        String cipherText = CaesarCipher.encode(plainText, key);
        String fileName = "ciphertext.txt";

        TextMessageSaverLoader.saveAsCipherText(plainText, key, fileName);

        File file = new File(fileName);
        assertTrue(file.exists());

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            assertEquals(br.readLine(), cipherText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Before
    public void setUp() throws Exception {
        String text = "sometext";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(TEMP_FILE_NAME))) {
            bw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test(timeout = 1000)
    public void loadTextFromFile() throws Exception {

        try (BufferedReader br = new BufferedReader(new FileReader(TEMP_FILE_NAME))) {
            assertEquals(br.readLine(), TextMessageSaverLoader.loadTextFromFile(TEMP_FILE_NAME));
        } catch (IOException e) {
            e.printStackTrace();
        }
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