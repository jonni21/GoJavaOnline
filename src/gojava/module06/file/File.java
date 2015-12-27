package gojava.module06.file;

public abstract class File {

    public void rename() {

        try {
            //
        } catch (IllegalStateException e) {
            System.err.println("IllegalStateException: " + e.getMessage());
        } finally {
            //
        }
    }
}
