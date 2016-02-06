package gojava.module10;

import gojava.module09.CaesarCipher;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextMessageSaverLoader {

    public void saveAsPlainText(String text, String fileName) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(text);
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }

    public void saveAsCipherText(String text, int key, String fileName) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(CaesarCipher.encode(text, key));
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}

