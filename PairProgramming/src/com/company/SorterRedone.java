package com.company;

import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class SorterRedone {

    static String alphabet = "abcdefghijklmnopqrstuvwxyzé";

    static String dir = "C:\\Users\\npere\\IdeaProjects\\PairProgramming\\unsortedDictTest.txt";

    static LinkedList<LinkedList> dict = new LinkedList<>();



    public static void main(String args[]) {
        makeList();
        try {
            sort();
            fileGenerator();
        }
        catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void makeList(){
        for (char letter : alphabet.toCharArray()){
            dict.add(new LinkedList<String>());
        }
    }

    public static void sort() throws FileNotFoundException {
        File file = new File(dir);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {

            String word = sc.nextLine().toLowerCase();
            int indicator = alphabet.indexOf(word.charAt(0));

            int position = compare(word, indicator);

            if(position != -1) {
                dict.get(indicator).add(position, word);
            }
            else {
                dict.get(indicator).add(word);
            }
        }
        sc.close();
    }

    public static int compare(String word, int indicator) {

        ListIterator iterator1 = dict.get(indicator).listIterator(0);
        int result = 0;

        while(iterator1.hasNext()){

            String temp = iterator1.next().toString();
            if (word.compareTo(temp) < 0){
                return result;
            }
            result++;
        }
        return -1;
    }

    static String[] lines = new String[10000];

    public static void fileGenerator() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("sorteddict.txt","UTF-8");
        int i = 0;
        for(LinkedList<String> element : dict) {
            for(String word: element) {
                lines[i] = word;
                i++;
                writer.println(word);
            }
        }
        writer.close();
    }

}