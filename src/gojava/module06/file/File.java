package gojava.module06.file;

public abstract class File {

    private String name;

    public void rename() {

        try {
            //
        } catch (IllegalStateException e) {
            System.err.println("IllegalStateException: " + e.getMessage());
        } finally {
            //
        }
    }

    public void open() throws NoSuchFileException{

        if (name == null) {
            throw new NoSuchFileException();
        }
    }
}
