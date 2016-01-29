package gojava.module08;

import java.util.Collection;

import gojava.module08.file.*;

class PrintCollectionAsATable {

    static void print(Collection<File> roster) {

        StringBuilder filesTable = new StringBuilder();
        filesTable.append("File Type");
        filesTable.append("\t\t");
        filesTable.append("Name");
        filesTable.append('\n');
        filesTable.append("------------------------------------\n");

        for (File file : roster) {
            filesTable.append(file.getClass().getSimpleName());
            filesTable.append("\t|\t");
            filesTable.append(file.getName());
            filesTable.append('\n');
        }

        System.out.println(filesTable.toString());
    }
}
