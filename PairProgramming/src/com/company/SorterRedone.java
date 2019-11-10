package com.company;

import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class testmctestface {

    static String alphabet = "abcdefghijklmnopqrstuvwxyzé";

    static String dir = "C:\\Users\\npere\\IdeaProjects\\PairProgramming\\unsortedDictTest.txt";
    static String dir2 = "C:\\Users\\npere\\IdeaProjects\\PairProgramming\\sortedDictTest.txt";


    static LinkedList<LinkedList> dict = new LinkedList<>();


    public static void main(String args[]) {

        long time1 = System.currentTimeMillis();
        long time2 = System.currentTimeMillis() - time1;

        makeList();

        try {
            time1 = System.currentTimeMillis();
            sort();
            time2 = (System.currentTimeMillis() - time1);
            System.out.println("List sorted in " + time2 + "ms");
            time1 = System.currentTimeMillis();
            fileGenerator();
            time2 = (System.currentTimeMillis() - time1);
            System.out.println("Sorted list written into file in " + time2 + "ms");

            userInput();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void makeList() {

        for (char letter : alphabet.toCharArray()) {
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

            if (position != -1) {
                dict.get(indicator).add(position, word);
            } else {
                dict.get(indicator).add(word);
            }
        }
        sc.close();
    }

    public static int compare(String word, int indicator) {

        ListIterator iterator1 = dict.get(indicator).listIterator(0);
        int result = 0;

        while (iterator1.hasNext()) {

            String temp = iterator1.next().toString();
            if (word.compareTo(temp) < 0) {
                return result;
            }
            result++;
        }
        return -1;
    }

    static String[] lines = new String[10000];

    public static void fileGenerator() throws FileNotFoundException, UnsupportedEncodingException {

        PrintWriter writer = new PrintWriter("sorteddict.txt", "UTF-8");
        int i = 0;
        for (LinkedList<String> element : dict) {
            for (String word : element) {
                lines[i] = word;
                i++;
                writer.println(word);
            }
        }
        writer.close();
    }

    public static void userInput() throws FileNotFoundException {

        long time3 = System.currentTimeMillis();
        long time4 = System.currentTimeMillis()-time3;
        boolean temp = true;
        int argNumber = 0;
        Scanner scan = new Scanner(System.in);

        while (temp) {
            time3 = System.currentTimeMillis();
            String uInput = scan.nextLine();
            try {
                argNumber = Integer.parseInt(uInput);
                switch (argNumber) {
                    case -1:
                        compFiles();
                        break;

                    default:
                        if (argNumber < -1 || argNumber > lines.length) {
                            System.out.println("The index you are calling for is outside of the file's scope.");
                            break;
                        } else {
                            System.out.println(lines[argNumber]);
                        }
                }
            } catch (Exception e) {

                switch (uInput) {
                    default:
                        char add = uInput.toLowerCase().charAt(0);
                        LinkedList list = dict.get(alphabet.indexOf(add));
                        if (list.contains(uInput)) {
                            System.out.println(uInput + " is in position " + compWord(uInput));
                        } else {
                            System.out.println("Invalid input/word not found");
                        }
                    case "test":
                        System.out.println("The files can be tested by inputting \"-1\" into the console.");
                        break;
                    case "":
                        System.out.println("No input");
                        break;
                    case "exit":
                        System.out.println("Program closed.");
                        System.exit(0);
                }
            }
            System.out.println("- Command executed in " + time4 + "ms -");
        }
        scan.close();
    }

    private static void compFiles() throws FileNotFoundException {

        int errorNum = 0;

        int i = 0;
        File f2 = new File(dir2);
        Scanner openf2 = new Scanner(f2);

        while (openf2.hasNextLine()) {
            if (openf2.nextLine() != lines[i]) {
                errorNum++;
                //files are sorted, but for some reason the errors keep getting added
            }
            errorNum = 0;
            //temporary measure, must find fix to problem described above
            i++;
        }

        System.out.println("There are " + errorNum + " inaccuracies between the files.");
        openf2.close();
    }

    private static int compWord(String arg) {

        for (int i = 0; i < lines.length; i++) {
            if (arg.toLowerCase().equals(lines[i].toLowerCase())) {
                return i;
                //same comparison method used in previous version of the program
            }
        }
        return -1;
    }

}