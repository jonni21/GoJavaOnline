package gojava.module06.file;

public class Main {

    public static void main(String[] args) {

        TextFile textFile = new TextFile();
        try {
            textFile.open();
        } catch (NoSuchFileException e) {
            //
        } finally {
            //
        }
    }

}
