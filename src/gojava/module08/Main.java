package gojava.module08;

import gojava.module08.file.*;

import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Directory home = new Directory();
        home.addFile(new PictureFile("nature.jpg"));
        home.addFile(new TextFile("sometext.txt"));
        home.addFile(new AudioFile("nirvana.mp3"));
        home.addFile(new TextFile("contract.doc"));
        home.addFile(new PictureFile("girls.png"));
        home.addFile(new AudioFile("wonderwall.mp3"));
        home.addFile(new PictureFile("animals.bmp"));
        home.addFile(new TextFile("readme.txt"));
        home.addFile(new AudioFile("stereophonics.mp3"));

        PrintCollectionAsATable.print(home.getFilesList());

        TreeSet<File> sortedList = home.getFilesList().stream()
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("\nSorted collection: ");
        PrintCollectionAsATable.print(sortedList);

    }
}
