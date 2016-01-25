package gojava.module08;

import java.util.Collection;

import gojava.module08.file.*;

public class PrintCollectionAsATable {

    public static void print(Collection<File> roster) {

        for (File file : roster) {
            System.out.println(file.toString());
        }
    }
}
