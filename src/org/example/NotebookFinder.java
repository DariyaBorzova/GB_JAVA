package org.example;

import java.util.HashSet;
import java.util.Iterator;

public class NotebookFinder {
    public void findNotebook(HashSet<Notebook> notebookSet, Criteria criteria) {
        Iterator iterator = notebookSet.iterator();
        while (iterator.hasNext()) {
            Notebook notebook = (Notebook) iterator.next();
            if (this.checkNotebook(notebook, criteria)) {
                this.printNotebook(notebook);
            }
        }
    }

    private Boolean checkNotebook(Notebook notebook, Criteria criteria) {
        if (criteria.getName().equals("colour") && notebook.getColour().equals(criteria.getValue())) {
            return true;
        } else if (criteria.getName().equals("brand") && notebook.getBrand().equals(criteria.getValue())) {
            return true;
        }
        return false;
    }

    private void printNotebook(Notebook notebook) {
        System.out.println("Brand: " + notebook.getBrand());
        System.out.println("Colour: " + notebook.getColour());
        System.out.println("Price: " + notebook.getPrice());
        System.out.println("RAM: " + notebook.getRam());
    }
}
