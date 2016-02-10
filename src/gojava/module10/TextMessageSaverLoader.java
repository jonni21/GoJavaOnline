package gojava.module10;

import gojava.module09.CaesarCipher;

import java.io.*;

public class TextMessageSaverLoader {

    public static void saveAsPlainText(String text, String fileName) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(text);
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }

    public static void saveAsCipherText(String text, int key, String fileName) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(CaesarCipher.encode(text, key));
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }

    public static String loadTextFromFile(String fileName) {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            return br.readLine();
        } catch (IOException e) {
            System.err.println(e.toString());
        }
        return "";
    }
}

