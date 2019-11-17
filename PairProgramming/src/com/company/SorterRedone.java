package com.company;

import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class SorterRedone {

    static String alphabet = "abcdefghijklmnopqrstuvwxyzé";

    static String directory1 = "C:\\Users\\npere\\IdeaProjects\\PairProgramming\\unsortedDictTest.txt";
    static String directory2 = "C:\\Users\\npere\\IdeaProjects\\PairProgramming\\sortedDictTest.txt";


    static LinkedList<LinkedList> dictionaryList = new LinkedList<>();


    public static void main(String args[]) {

        long timeBefore;
        long timeDifference;

        makeList();

        try {
            timeBefore = System.currentTimeMillis();
            sortList();
            timeDifference = (System.currentTimeMillis() - timeBefore);
            System.out.println("List sorted in " + timeDifference + "ms");
            timeBefore = System.currentTimeMillis();
            sortedListToFile();
            timeDifference = (System.currentTimeMillis() - timeBefore);
            System.out.println("Sorted list written into file in " + timeDifference + "ms");

            userInput();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void makeList() {

        for (char letter : alphabet.toCharArray()) {
            dictionaryList.add(new LinkedList<String>());
        }
    }

    public static void sortList() throws FileNotFoundException {

        File fileToSort = new File(directory1);
        Scanner sc = new Scanner(fileToSort);
        while (sc.hasNextLine()) {

            String word = sc.nextLine().toLowerCase();
            int indicator = alphabet.indexOf(word.charAt(0));

            int position = compareValuesWhileTheyAreAddedToTheSortedList(word, indicator);

            if (position != -1) {
                dictionaryList.get(indicator).add(position, word);
            } else {
                dictionaryList.get(indicator).add(word);
            }
        }
        sc.close();
    }

    public static int compareValuesWhileTheyAreAddedToTheSortedList(String word, int key) {

        ListIterator sortingIterator = dictionaryList.get(key).listIterator(0);
        int result = 0;

        while (sortingIterator.hasNext()) {

            String temporaryString = sortingIterator.next().toString();
            if (word.compareTo(temporaryString) < 0) {
                return result;
            }
            result++;
        }
        return -1;
    }

    static String[] lines = new String[10000];

    public static void sortedListToFile() throws FileNotFoundException, UnsupportedEncodingException {

        PrintWriter writer = new PrintWriter("sorteddict.txt", "UTF-8");
        int i = 0;
        for (LinkedList<String> element : dictionaryList) {
            for (String word : element) {
                lines[i] = word;
                i++;
                writer.println(word);
            }
        }
        writer.close();
    }

    public static void userInput() throws FileNotFoundException {

        long timeBeforeInput = System.currentTimeMillis();
        long timeDifferenceInput = System.currentTimeMillis()-timeBeforeInput;
        boolean loopKeeper = true;
        int userInputsNumber = 0;
        Scanner scan = new Scanner(System.in);

        while (loopKeeper) {
            timeBeforeInput = System.currentTimeMillis();
            String userInputsText = scan.nextLine();
            try {
                userInputsNumber = Integer.parseInt(userInputsText);
                switch (userInputsNumber) {
                    case -1:
                        checkAccuracy();
                        break;

                    default:
                        if (userInputsNumber < -1 || userInputsNumber > lines.length) {
                            System.out.println("The index you are calling for is outside of the file's scope.");
                            break;
                        } else {
                            System.out.println(lines[userInputsNumber]);
                        }
                }
            } catch (Exception e) {

                switch (userInputsText) {
                    default:
                        char add = userInputsText.toLowerCase().charAt(0);
                        LinkedList list = dictionaryList.get(alphabet.indexOf(add));
                        if (list.contains(userInputsText)) {
                            System.out.println(userInputsText + " is in position " + userInputCompareWord(userInputsText));
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
            System.out.println("- Command executed in " + timeDifferenceInput + "ms -");
        }
        scan.close();
    }

    private static void checkAccuracy() throws FileNotFoundException {

        int correctLinesNum = 0;

        int totalLinesChecked = 0;
        File controlFile = new File(directory2);
        Scanner openf2 = new Scanner(controlFile);

        while (openf2.hasNextLine()) {
            if (openf2.nextLine() != lines[totalLinesChecked]) {
                correctLinesNum++;
            }
            totalLinesChecked++;
        }

        System.out.println("There are " + (totalLinesChecked-correctLinesNum) + " inaccuracies between the files.");
        openf2.close();
    }

    private static int userInputCompareWord(String userInputWord) {

        for (int i = 0; i < lines.length; i++) {
            if (userInputWord.toLowerCase().equals(lines[i].toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

}