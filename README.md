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

## Changes with respect to the previous version
The previous version was unsuitable for software testing procedures in any reasonable sense due to the complex and lengthy nature of the program. Acting on feedback given during the review of the program, the linked list generation was put into its own method, and rather than having an if clause for the creation of each list, a more efficient method using a for loop and a linked list of linked lists was used. As a side note, the function of colons in for loops in java was dicovered during this process, making the writing of this kind of for loops less tedious and slightly more visually appealing. Talking about for loops, the method of iteration to compare words when creating the list was changed. Rather than using the slow, clunky for loops used prior (based on feedback given in class), the iterator class was used. This was orders of magnitude faster, and allowed the program to be completed in seconds, as opposed to the usual 20 or so minutes in the previous 564 lines long "fast" program or hours in the most basic version. These changes did not fulfill any of the objectives for the software testing exercise except perhaps for bottleneck identification/solving, but were made to make the exercise feasible.
```java
public static void makeList() {

        for (char letter : alphabet.toCharArray()) {
            dict.add(new LinkedList<String>());
        }
    }
```

```java
ListIterator iterator1 = dict.get(indicator).listIterator(0);
        int result = 0;

        while (iterator1.hasNext()) {

            String temp = iterator1.next().toString();
            if (word.compareTo(temp) < 0) {
                return result;
            }
            result++;
```

### User input and comparing the files
More varied user inputs were allowed in this program by using switch rather than if clauses. Some commands give viable outputs, such as -1 and exit, whereas incorrect inputs give an "invalid output" message. If the command "test" is given, the program will not execute the comparison and will instead recommend that the user input the command "-1" instead. If an index beyond the scope of the file is given, another message is written alerting the user to this fact. This part is fairly simple and was most notable in its replacement of if clauses with switch and the corresponding switch cases, which among other things makes it much, much easier to allow the program to distinguish between integer and string inputs. The entire system sits within a while loop dictated by the boolean temp. This is simply done to keep the loop running, as instead of exiting the program by setting temp to false, the command "System.exit(0)" is used instead. The following are examples of commands and their designated outputs.

```java
default:
                        if (argNumber < -1 || argNumber > lines.length) {
                            System.out.println("The index you are calling for is outside of the file's scope.");
                            break;
                        } else {
                            System.out.println(lines[argNumber]);
                        }
```

```java
case "test":
                        System.out.println("The files can be tested by inputting \"-1\" into the console.");
```

```java
case "exit":
                        System.out.println("Program closed.");
                        System.exit(0);
```

```java
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
```

### Timers
Finally, the simplest part of the program was added, the time checks. This was done by creating two sets of long type variables. Each set was the first variable denoting the current time and the second time subtracting the first variable's time from its own. These envelop each method and thus show the time needed to complete each process. The second set envelops the while loop of user input, showing the time taken to carry out each command. The processes carried out are trivial timewise, so they generally display a 0ms timespan for the completion of the command.

```java
long time3 = System.currentTimeMillis();
        long time4 = System.currentTimeMillis()-time3;
```
```java
            System.out.println("- Command executed in " + time4 + "ms -");
```

## The End
This marks the end of the second part of pair programming. For a complete view of the overhauled program, open SorterRedone in src/com/company.

# Coding principles

**The goal of this activity was to read through the code and check if it abides by the coding principles established during class, to ensure it is understandable and reliable.**

## Coding principle 1: meaningful names
This was the main activity carried out during this exercise, as the rest of the coding principles had been fulfilled for the most part (proof will still be shown). Though there were no "silly" or joke names, there were names made up quickly and without much thought, such as time1 and time2 for measuring time. These were changed to timeBefore and timeDifference respectively. Function names were also changed, and they should now effectively convey the purpose of the function, such as sortedListToFile, which reads through the sorted list and writes it into a file, or the rightfully long compareValuesWhileTheyAreAddedToTheSortedList. This last one was necessary as shortening it made the meaning too obscure. The remaining changes would take up a lot of space, and they can be seen in the program in src/com/company/SorterRedone.java.

## Coding principle 2: keep functions small
The functions in this new program were designed to segment the tasks the the program carries out into readable chunks. The longest one is userInput, but this is unfortunately necessary. This is because it uses a set of switch cases which, although they could potentially be separated into their own function, works better when integrated into userInput. This is because the functionality of this function has the switch cases at its core, and they are therefore helpful in understanding the function when reading through it. The rest compartmentalise each of their respective tasks into workable chunks. Here are some examples:
```java
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
```

```java
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
```

## Coding principle 3: avoid redundant commenting
This principle was almost already resolved. The only comments in the code had to do with an issue regarding the checkAccuracy() function, but these were resolved and the comments were removed. Since the functions and the code should be fairly self explanatory accross the board, there are now no comments present in the code.

## Coding principle 4: SRP (Single Responsibility Principle)
Again, the code was modified from its first version according to feedback given in class. Each method is compartmentalised in such a way that it carries out an individual task. checkAccuracy() compares a control (correct/testing file, in this case the sorted one) with the sorted file generated by the program. userInput() identifies what the user input corresponds to and carries out the matching function. For example, writing -1 in the console will make the program run the checkAccuracy() method, so if there was an error with the checkAccuracy() method, it wouldn't need to be changed both in said method and in the userInput() method, it only has to be changed in the former.

## Coding principle 5: DRY (Don't Repeat Yourself)
This principle was also explained in the previous paragraph. Rather than copying and repeating code, methods are called for within other methods, ensuring none of the code is redundant and that there are no repetitions. The most clear example of this is the aforementioned -1 input in the userInput() method.

## Coding principle 6: keep your code simple
This point is extremely relevant to this project. In its first iteration, the code designed to sort the list was 564 lines long, and required an "if generator" to generate all of the repeated code. It was very unweildy, very hard to understand, and incredibly difficult to modify. Now, having reduced the iterating process to a couple lines of code within an isolated method, and having replaced the for loop iteration with the iterator class, the code now is much more understandable and compact, making it much easier to understand and work with.

## Coding principle 7: YAGNI (You Ain't Gonna Need It)
In the case of this project, this is very easy to justify. Every unnecessary aspect from the previous version of this program has been removed, from the if generator class to the well over 200 lines of if clauses. Instead, only the conceptual iterating style remains, having been optimised both in terms of size and speed. Overall, most of the code has been changed, and none of the unnecessary parts have been retained.
