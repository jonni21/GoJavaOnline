package gojava.module10;

import java.io.*;

/**
 * This class implements Caesar Cipher code.
 *
 * @version 1.0.0   29 Jan 2016
 * @author Evgeny Zvezdovskiy
 */


public class CaesarCipher {
    /* To match letters to the numbers we can use Unicode */

    /** The first letter 'a' matches to the corresponding Unicode code point  */
    final static private int FIRST_LETTER_CODE_POINT = "a".codePointAt(0);

    /** The last letter 'z' matches to the corresponding Unicode code point  */
    final static private int LAST_LETTER_CODE_POINT = "z".codePointAt(0);

    public static String encode(String text, int key) {
        text = text.toLowerCase();
        int[] plainTextCodePoints = new int[text.length()];
        int[] cipherTextCodePoints = new int[text.length()];

        for (int i = 0; i < text.length(); i++) {
            plainTextCodePoints[i] = text.codePointAt(i);
        }

        for (int i = 0; i < text.length(); i++) {
            if ((plainTextCodePoints[i] + key) <= LAST_LETTER_CODE_POINT) {
                cipherTextCodePoints[i] = plainTextCodePoints[i] + key;
            } else {
                cipherTextCodePoints[i] = (FIRST_LETTER_CODE_POINT - 1)
                        + ((plainTextCodePoints[i] + key) % LAST_LETTER_CODE_POINT);
            }
        }

        return new String(cipherTextCodePoints, 0, cipherTextCodePoints.length);
    }

    public static String decode(String text, int key) {
        text = text.toLowerCase();
        int[] plainTextCodePoints = new int[text.length()];
        int[] cipherTextCodePoints = new int[text.length()];

        for (int i = 0; i < text.length(); i++) {
            cipherTextCodePoints[i] = text.codePointAt(i);
        }

        for (int i = 0; i < text.length(); i++) {
            if ((cipherTextCodePoints[i] - key) >= FIRST_LETTER_CODE_POINT) {
                plainTextCodePoints[i] = cipherTextCodePoints[i] - key;
            } else {
                plainTextCodePoints[i] = (LAST_LETTER_CODE_POINT + 1)
                        - (FIRST_LETTER_CODE_POINT - (cipherTextCodePoints[i] - key));
            }
        }

        return new String(plainTextCodePoints, 0, plainTextCodePoints.length);
    }

    public static void encodeToFile(String text, int key, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(encode(text, key));
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }

    public static String decodeFromFile(String fileName, int key) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            return decode(br.readLine(), key);
        }
    }
}
