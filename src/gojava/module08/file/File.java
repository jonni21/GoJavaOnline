package gojava.module08.file;

public abstract class File implements Comparable<File> {

    protected String name;

    public File(String name) {
        this.name = name;
    }

    public File() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(File file) {
        return getName().compareTo(file.getName());
    }
}
