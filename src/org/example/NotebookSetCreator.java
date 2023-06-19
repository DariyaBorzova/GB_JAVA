package org.example;

import java.util.HashSet;

public class NotebookSetCreator {
    public HashSet<Notebook> getNotebookSet() {
        Notebook notebook1 = new Notebook("Acer", 50000, "red", 16);
        Notebook notebook2 = new Notebook("Apple", 120000, "blue", 32);
        Notebook notebook3 = new Notebook("Asus", 80000, "silver", 64);
        Notebook notebook4 = new Notebook("Sony", 65000, "gold", 16);
        HashSet<Notebook> notebookSet = new HashSet<>();
        notebookSet.add(notebook1);
        notebookSet.add(notebook2);
        notebookSet.add(notebook3);
        notebookSet.add(notebook4);
        return notebookSet;
    }
}
