package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> alpha = new LinkedList<String>();

        int progress = 0;
        String word;
        File unsorted = new File("unsorteddict.txt");
        try {
            Scanner sc = new Scanner(unsorted);
            while (sc.hasNextLine()) {
                word = sc.nextLine();
                if (alpha.size() == 0) {
                    alpha.add(word);
                    progress++;
                    System.out.println(progress);
                }
                for (int ind = 0; ind < alpha.size(); ind++) {
                    if (word.compareTo(alpha.get(ind)) < 0) {
                        alpha.add(ind, word);
                        progress++;
                        System.out.println(progress);
                        break;
                    }

                }
                if (alpha.size() == 1000) {
                    System.out.println(alpha);
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        PrintWriter writer = new PrintWriter("sorted.txt", "UTF-8");
        for (int i = 0; i < alpha.size(); i++) {
            writer.println(alpha.get(i));
        }
        Scanner choice = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);
        System.out.println("Please introduce 1 for a number or 2 for a word");
        int ch = choice.nextInt();
        String check = number2.nextLine();
        if (ch==1) {
            if (alpha.get(ch) != null) {
                System.out.println(alpha.get(ch));
            } else {
                System.out.println("-1");
            }
        } else if (ch==2) {
            if(alpha.contains(check)) {
                System.out.println(alpha.indexOf(check));
            } else {
                System.out.println("-1");
            }
        }
        choice.close();
        number2.close();
    }
}