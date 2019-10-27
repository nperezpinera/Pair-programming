# Pair-programming
## Nicolás Pérez, Javier Ulecia

**The goal** of this exercise was to use the previously learned intellij java skills to develop our pair programming capabilities. This would be done by creating a program which would take an unsorted dictionary file and, by way of an algorithm of our own making, create a new sorted dictionary file while allowing users to search for words in said dictionary.

### Main method
The **Main.java** class uses a simple algorith to iterate through the unsorted document. After reading the file, the first word is put into a linked list. Once this first word is in, the algorithm used takes every word read from unsorteddict.txt and iterates through the list, comparing it to the words already in it by using the compareTo method. This ensures the words are in alphabetical order. Here is the most important part of the algorithm:
```java
for (int ind = 0; ind < alpha.size(); ind++) {
                    if (word.compareTo(alpha.get(ind)) < 0) {
                        alpha.add(ind, word);
                        progress++;
                        System.out.println(progress);
                        break;
                    }

                }
```
Printwriter is then used to create a new file, and scanner is used to record user input, allowing a choice between searching either a position (int) or a word (String). Though this class works, it takes a long time to complete. This is because as the list gets longer, iterating through it becomes exponentially more time-consuming.

The following class seeks to fix that by using 26 lists instead of one.

### Faster method
The faster solution relies on the ifGenerator class. Rather than using only one list to house all the values, it has one list for each letter in the alphabet. After the 26 lists are created, a set of ifs for each list have to be created. However, this would be very time consuming, so a separate class, named ifGenerator.java, was created. The purpose of this class is to generate these 26 if statements by printing them. The result is then copied over the the original class. The code is very lengthy so it will not be posted here, but this repository contains the class so it can be viewed there. Here is an example of one of the 26 if statements:
```java
if (word.toLowerCase().compareTo("a") >= 0) {
                    if (word.toLowerCase().compareTo("b") < 0) {
                        if (a.size() == 0) {
                            a.add(word);
                        }
                        for (int letter = 0; letter < a.size(); letter++) {
                            if (word.compareTo(a.get(letter)) < 0) {
                                a.add(letter, word);
                                break;
                            }
                        }
                    }

                }
```
At its core the code that iterates through each list is the same as in the first class, but enclosed within a set of if statements. This makes the process much faster. Each list is then added to a new file, and user commands are integrated.

**Commits were made from each group member's computer, while the entirety of the code was written in a cooperative manner.**
