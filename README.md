# Pair-programming
## Nicolás Pérez, Javier Ulecia

**The goal** of this exercise was to use the previously learned intellij java skills to develop our pair programming capabilities. This would be done by creating a program which would take an unsorted dictionary file and, by way of an algorithm of our own making, create a new sorted dictionary file while allowing users to search for words in said dictionary.

### Main method
The **Main.java** class uses a simple algorith to iterate through the unsorted document. After reading the file, the first word is put into a linked list. Once this first word is in, the algorithm used takes every word read from unsorteddict.txt and iterates through the list, comparing it to the words already in it by using the compareTo method. This ensures the words are in alphabetical order. Here is the most important part of the algorithm:
```java
ºººfor (int ind = 0; ind < alpha.size(); ind++) {
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
The 
