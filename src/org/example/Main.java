package org.example;

import org.example.Notebook;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws Exception {
        NotebookSetCreator notebookSetCreator = new NotebookSetCreator();
        HashSet<Notebook> notebookSet = notebookSetCreator.getNotebookSet();
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Enter criteria number:\n" +
                "1 - colour\n" +
                "2 - brand");
        String criteriaNumber = (String) reader.readLine();

        System.out.println("Enter filter value");
        String value = reader.readLine();

        Criteria criteria = new Criteria(criteriaNumber, value);
        NotebookFinder notebookFinder = new NotebookFinder();
        notebookFinder.findNotebook(notebookSet, criteria);
    }


}
