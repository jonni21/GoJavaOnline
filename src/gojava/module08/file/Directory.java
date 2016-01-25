package gojava.module08.file;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    PictureFile pictureFile;
    AudioFile audioFile;
    TextFile textFile;
    List<File> filesList = new ArrayList<>();

    public void addFile(File file) {
        filesList.add(file);
    }

    public List<File> getFilesList() {
        return filesList;
    }
}

