package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.Collator;
import java.util.LinkedList;
import java.util.Scanner;

public class ifGenerator {
    public static void main(String[] args) {

        String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String al[] = alphabet.split(" ");

        for (int i = 0; i < al.length; i++) {
            if (al[i] != "z") {
                System.out.println("else if (word.toLowerCase().compareTo(\""+ al[i] +"\") >= 0) {\n" +
                        "                    if (word.toLowerCase().compareTo(\""+ al[i+1] +"\") < 0) {\n" +
                        "                        if ("+ al[i] +".size() == 0) {\n" +
                        "                            "+ al[i] +".add(word);\n" +
                        "                        }\n" +
                        "                        for (int letter = 0; letter < "+ al[i] +".size(); letter++) {\n" +
                        "                            if (word.compareTo("+ al[i] +".get(letter)) < 0) {\n" +
                        "                                "+ al[i] +".add(letter, word);\n" +
                        "                                break;\n" +
                        "                            }\n" +
                        "                        }\n" +
                        "                    }\n" +
                        "\n" +
                        "                }");
            } else if (al[i] == "z") {
                System.out.println("if (word.toLowerCase().compareTo(\"" + al[i] + "\") > 0) {\n" +
                    "                            for (int letter = 0; letter < " + al[i] + ".size(); letter++) {\n" +
                    "                                if (word.compareTo(" + al[i] + ".get(letter)) < 0) {\n" +
                    "                                    " + al[i] + ".add(ind, word);\n" +
                    "                                    break;\n" +
                    "                                }\n" +
                    "                            }\n" +
                        "                    }");
            }
        }
    }
}
