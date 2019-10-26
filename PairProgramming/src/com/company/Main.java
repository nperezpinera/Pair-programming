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
                if (alpha.size() == 0) {
                    alpha.add(word);
                } for (int ind = 0; ind < alpha.size(); ind++) {
                    if (word.compareTo(alpha.get(ind)) < 0) {
                        alpha.add(ind, word);
                        break;
                    }

                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}