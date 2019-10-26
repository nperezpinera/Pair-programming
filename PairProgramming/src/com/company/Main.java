package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> alpha = new LinkedList<String>();

        String word;
        File unsorted = new File("unsorteddict.txt");
        try {
            Scanner sc = new Scanner(unsorted);
            while (sc.hasNextLine()) {
                word = sc.nextLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}