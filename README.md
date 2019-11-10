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

**Commits were made from each group member's computer, while the entirety of the code was written in a cooperative manner. All of the code can be seen in the three classes within this repository (inside the PairProgramming folder).**

# Software testing

**The goal of this exercise was to add several features common in software testing processes. These include timers to track progress throughout the creation of the file, user inputs and contingencies for invalid inputs, and a comparison method to test the new sorted file against a control file.**

## Changes in respect of the previous version
The previous version was unsuitable for software testing procedures in any reasonable sense due to the complex and lengthy nature of the program. Acting on feedback given during the review of the program, the linked list generation was put into its own method, and rather than having an if clause for the creation of each list, a more efficient method using a for loop and a linked list of linked lists was used. As a side note, the function of colons in for loops in java was dicovered during this process, making the writing of this kind of for loops less tedious and slightly more visually appealing. Talking about for loops, the method of iteration to compare words when creating the list was changed. Rather than using the slow, clunky for loops used prior (based on feedback given in class), the iterator class was used. This was orders of magnitude faster, and allowed the program to be completed in seconds, as opposed to the usual 20 or so minutes in the previous 564 lines long "fast" program or hours in the most basic version. These changes did not fulfill any of the objectives for the software testing exercise except perhaps for bottleneck identification/solving, but were made to make the exercise feasible.
