package gojava.module09;

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
        int[] textCodePoints = new int[text.length()];
        int[] cipherTextCodePoints = new int[text.length()];

        for (int i = 0; i < text.length(); i++) {
            textCodePoints[i] = text.codePointAt(i);
        }

        for (int i = 0; i < text.length(); i++) {
            if ((textCodePoints[i] + key) <= LAST_LETTER_CODE_POINT) {
                cipherTextCodePoints[i] = textCodePoints[i] + key;
            } else {
                cipherTextCodePoints[i] = (FIRST_LETTER_CODE_POINT - 1)
                        + ((textCodePoints[i] + key) % LAST_LETTER_CODE_POINT);
            }
        }

        return new String(cipherTextCodePoints, 0, cipherTextCodePoints.length);
    }

    public static String decode(String text, int key) {
        int[] textCodePoints = new int[text.length()];
        int[] cipherTextCodePoints = new int[text.length()];

        for (int i = 0; i < text.length(); i++) {
            cipherTextCodePoints[i] = text.codePointAt(i);
        }

        for (int i = 0; i < text.length(); i++) {
            if ((cipherTextCodePoints[i] - key) >= FIRST_LETTER_CODE_POINT) {
                textCodePoints[i] = cipherTextCodePoints[i] - key;
            } else {
                textCodePoints[i] = (LAST_LETTER_CODE_POINT + 1)
                        - ((cipherTextCodePoints[i] + key) % LAST_LETTER_CODE_POINT);
            }
        }

        return new String(textCodePoints, 0, textCodePoints.length);
    }
}
