package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class FasterSort {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        LinkedList<String> a = new LinkedList<String>();
        LinkedList<String> b = new LinkedList<String>();
        LinkedList<String> c = new LinkedList<String>();
        LinkedList<String> d = new LinkedList<String>();
        LinkedList<String> e = new LinkedList<String>();
        LinkedList<String> f = new LinkedList<String>();
        LinkedList<String> g = new LinkedList<String>();
        LinkedList<String> h = new LinkedList<String>();
        LinkedList<String> i = new LinkedList<String>();
        LinkedList<String> j = new LinkedList<String>();
        LinkedList<String> k = new LinkedList<String>();
        LinkedList<String> l = new LinkedList<String>();
        LinkedList<String> m = new LinkedList<String>();
        LinkedList<String> n = new LinkedList<String>();
        LinkedList<String> o = new LinkedList<String>();
        LinkedList<String> p = new LinkedList<String>();
        LinkedList<String> q = new LinkedList<String>();
        LinkedList<String> r = new LinkedList<String>();
        LinkedList<String> s = new LinkedList<String>();
        LinkedList<String> t = new LinkedList<String>();
        LinkedList<String> u = new LinkedList<String>();
        LinkedList<String> v = new LinkedList<String>();
        LinkedList<String> w = new LinkedList<String>();
        LinkedList<String> x = new LinkedList<String>();
        LinkedList<String> y = new LinkedList<String>();
        LinkedList<String> z = new LinkedList<String>();

        String letter1 = "\u212B";
        String letter2 = "\u00E9";

        String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String al[] = alphabet.split(" ");

        String word;
        File unsorted = new File("unsorteddict.txt");
        try {
            Scanner sc = new Scanner(unsorted);
            while (sc.hasNextLine()) {
                word = sc.nextLine();
                //             } else if (word.compareTo(alpha.get(index)) < 0) {
                //                 alpha.add(index, word);
                //                 index++;
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

                }if (word.startsWith(letter1)) {
                    if (a.size() == 0) {
                        a.add(word);
                    }
                    for (int letter = 0; letter < a.size(); letter++) {
                        if (word.compareTo(a.get(letter)) < 0) {
                            a.add(letter, word);
                            break;
                        }
                    }
                }if (word.toLowerCase().compareTo("b") >= 0) {
                    if (word.toLowerCase().compareTo("c") < 0) {
                        if (b.size() == 0) {
                            b.add(word);
                        }
                        for (int letter = 0; letter < b.size(); letter++) {
                            if (word.compareTo(b.get(letter)) < 0) {
                                b.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("c") >= 0) {
                    if (word.toLowerCase().compareTo("d") < 0) {
                        if (c.size() == 0) {
                            c.add(word);
                        }
                        for (int letter = 0; letter < c.size(); letter++) {
                            if (word.compareTo(c.get(letter)) < 0) {
                                c.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("d") >= 0) {
                    if (word.toLowerCase().compareTo("e") < 0) {
                        if (d.size() == 0) {
                            d.add(word);
                        }
                        for (int letter = 0; letter < d.size(); letter++) {
                            if (word.compareTo(d.get(letter)) < 0) {
                                d.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("e") >= 0) {
                    if (word.toLowerCase().compareTo("f") < 0) {
                        if (e.size() == 0) {
                            e.add(word);
                        }
                        for (int letter = 0; letter < e.size(); letter++) {
                            if (word.compareTo(e.get(letter)) < 0) {
                                e.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.startsWith(letter2)) {
                    if (e.size() == 0) {
                        e.add(word);
                    }
                    for (int letter = 0; letter < e.size(); letter++) {
                        if (word.compareTo(e.get(letter)) < 0) {
                            e.add(letter, word);
                            break;
                        }
                    }
                }if (word.toLowerCase().compareTo("f") >= 0) {
                    if (word.toLowerCase().compareTo("g") < 0) {
                        if (f.size() == 0) {
                            f.add(word);
                        }
                        for (int letter = 0; letter < f.size(); letter++) {
                            if (word.compareTo(f.get(letter)) < 0) {
                                f.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("g") >= 0) {
                    if (word.toLowerCase().compareTo("h") < 0) {
                        if (g.size() == 0) {
                            g.add(word);
                        }
                        for (int letter = 0; letter < g.size(); letter++) {
                            if (word.compareTo(g.get(letter)) < 0) {
                                g.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("h") >= 0) {
                    if (word.toLowerCase().compareTo("i") < 0) {
                        if (h.size() == 0) {
                            h.add(word);
                        }
                        for (int letter = 0; letter < h.size(); letter++) {
                            if (word.compareTo(h.get(letter)) < 0) {
                                h.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("i") >= 0) {
                    if (word.toLowerCase().compareTo("j") < 0) {
                        if (i.size() == 0) {
                            i.add(word);
                        }
                        for (int letter = 0; letter < i.size(); letter++) {
                            if (word.compareTo(i.get(letter)) < 0) {
                                i.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("j") >= 0) {
                    if (word.toLowerCase().compareTo("k") < 0) {
                        if (j.size() == 0) {
                            j.add(word);
                        }
                        for (int letter = 0; letter < j.size(); letter++) {
                            if (word.compareTo(j.get(letter)) < 0) {
                                j.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("k") >= 0) {
                    if (word.toLowerCase().compareTo("l") < 0) {
                        if (k.size() == 0) {
                            k.add(word);
                        }
                        for (int letter = 0; letter < k.size(); letter++) {
                            if (word.compareTo(k.get(letter)) < 0) {
                                k.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("l") >= 0) {
                    if (word.toLowerCase().compareTo("m") < 0) {
                        if (l.size() == 0) {
                            l.add(word);
                        }
                        for (int letter = 0; letter < l.size(); letter++) {
                            if (word.compareTo(l.get(letter)) < 0) {
                                l.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("m") >= 0) {
                    if (word.toLowerCase().compareTo("n") < 0) {
                        if (m.size() == 0) {
                            m.add(word);
                        }
                        for (int letter = 0; letter < m.size(); letter++) {
                            if (word.compareTo(m.get(letter)) < 0) {
                                m.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("n") >= 0) {
                    if (word.toLowerCase().compareTo("o") < 0) {
                        if (n.size() == 0) {
                            n.add(word);
                        }
                        for (int letter = 0; letter < n.size(); letter++) {
                            if (word.compareTo(n.get(letter)) < 0) {
                                n.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("o") >= 0) {
                    if (word.toLowerCase().compareTo("p") < 0) {
                        if (o.size() == 0) {
                            o.add(word);
                        }
                        for (int letter = 0; letter < o.size(); letter++) {
                            if (word.compareTo(o.get(letter)) < 0) {
                                o.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("p") >= 0) {
                    if (word.toLowerCase().compareTo("q") < 0) {
                        if (p.size() == 0) {
                            p.add(word);
                        }
                        for (int letter = 0; letter < p.size(); letter++) {
                            if (word.compareTo(p.get(letter)) < 0) {
                                p.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("q") >= 0) {
                    if (word.toLowerCase().compareTo("r") < 0) {
                        if (q.size() == 0) {
                            q.add(word);
                        }
                        for (int letter = 0; letter < q.size(); letter++) {
                            if (word.compareTo(q.get(letter)) < 0) {
                                q.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("r") >= 0) {
                    if (word.toLowerCase().compareTo("s") < 0) {
                        if (r.size() == 0) {
                            r.add(word);
                        }
                        for (int letter = 0; letter < r.size(); letter++) {
                            if (word.compareTo(r.get(letter)) < 0) {
                                r.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("s") >= 0) {
                    if (word.toLowerCase().compareTo("t") < 0) {
                        if (s.size() == 0) {
                            s.add(word);
                        }
                        for (int letter = 0; letter < s.size(); letter++) {
                            if (word.compareTo(s.get(letter)) < 0) {
                                s.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("t") >= 0) {
                    if (word.toLowerCase().compareTo("u") < 0) {
                        if (t.size() == 0) {
                            t.add(word);
                        }
                        for (int letter = 0; letter < t.size(); letter++) {
                            if (word.compareTo(t.get(letter)) < 0) {
                                t.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("u") >= 0) {
                    if (word.toLowerCase().compareTo("v") < 0) {
                        if (u.size() == 0) {
                            u.add(word);
                        }
                        for (int letter = 0; letter < u.size(); letter++) {
                            if (word.compareTo(u.get(letter)) < 0) {
                                u.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("v") >= 0) {
                    if (word.toLowerCase().compareTo("w") < 0) {
                        if (v.size() == 0) {
                            v.add(word);
                        }
                        for (int letter = 0; letter < v.size(); letter++) {
                            if (word.compareTo(v.get(letter)) < 0) {
                                v.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("w") >= 0) {
                    if (word.toLowerCase().compareTo("x") < 0) {
                        if (w.size() == 0) {
                            w.add(word);
                        }
                        for (int letter = 0; letter < w.size(); letter++) {
                            if (word.compareTo(w.get(letter)) < 0) {
                                w.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("x") >= 0) {
                    if (word.toLowerCase().compareTo("y") < 0) {
                        if (x.size() == 0) {
                            x.add(word);
                        }
                        for (int letter = 0; letter < x.size(); letter++) {
                            if (word.compareTo(x.get(letter)) < 0) {
                                x.add(letter, word);
                                break;
                            }
                        }
                    }

                }if (word.toLowerCase().compareTo("y") >= 0) {
                        if (word.toLowerCase().compareTo("z") < 0) {
                            if (y.size() == 0) {
                                y.add(word);
                            }
                            for (int letter = 0; letter < y.size(); letter++) {
                                if (word.compareTo(y.get(letter)) < 0) {
                                    y.add(letter, word);
                                    break;
                                }
                            }
                        }
                }if (word.toLowerCase().compareTo("z") >= 0) {
                        if (z.size() == 0) {
                            z.add(word);
                        }
                        for (int letter = 0; letter < z.size(); letter++) {
                            if (word.compareTo(z.get(letter)) < 0) {
                                z.add(letter, word);
                                break;
                            }
                        }
                    }
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        PrintWriter writer = new PrintWriter("sorted.txt", "UTF-8");
        for (int var = 0; var < a.size(); var++) {
            writer.println(a.get(var));
        }
        for (int var = 0; var < b.size(); var++) {
            writer.println(b.get(var));
        }
        for (int var = 0; var < c.size(); var++) {
            writer.println(c.get(var));
        }
        for (int var = 0; var < d.size(); var++) {
            writer.println(d.get(var));
        }
        for (int var = 0; var < e.size(); var++) {
            writer.println(e.get(var));
        }
        for (int var = 0; var < f.size(); var++) {
            writer.println(f.get(var));
        }
        for (int var = 0; var < g.size(); var++) {
            writer.println(g.get(var));
        }
        for (int var = 0; var < h.size(); var++) {
            writer.println(h.get(var));
        }
        for (int var = 0; var < i.size(); var++) {
            writer.println(i.get(var));
        }
        for (int var = 0; var < j.size(); var++) {
            writer.println(j.get(var));
        }
        for (int var = 0; var < k.size(); var++) {
            writer.println(k.get(var));
        }
        for (int var = 0; var < l.size(); var++) {
            writer.println(l.get(var));
        }
        for (int var = 0; var < m.size(); var++) {
            writer.println(m.get(var));
        }
        for (int var = 0; var < n.size(); var++) {
            writer.println(n.get(var));
        }
        for (int var = 0; var < o.size(); var++) {
            writer.println(o.get(var));
        }
        for (int var = 0; var < p.size(); var++) {
            writer.println(p.get(var));
        }
        for (int var = 0; var < q.size(); var++) {
            writer.println(q.get(var));
        }
        for (int var = 0; var < r.size(); var++) {
            writer.println(r.get(var));
        }
        for (int var = 0; var < s.size(); var++) {
            writer.println(s.get(var));
        }
        for (int var = 0; var < t.size(); var++) {
            writer.println(t.get(var));
        }
        for (int var = 0; var < u.size(); var++) {
            writer.println(u.get(var));
        }
        for (int var = 0; var < v.size(); var++) {
            writer.println(v.get(var));
        }
        for (int var = 0; var < w.size(); var++) {
            writer.println(w.get(var));
        }
        for (int var = 0; var < x.size(); var++) {
            writer.println(x.get(var));
        }
        for (int var = 0; var < y.size(); var++) {
            writer.println(y.get(var));
        }
        for (int var = 0; var < z.size(); var++) {
            writer.println(z.get(var));
        }
        writer.close();

        File sorteddict = new File("sorted.txt");
        Scanner reader = new Scanner(sorteddict);
        int pos = 0;
        String words[] = new String[100000];
        while (reader.hasNextLine()) {
            words[pos] = reader.nextLine();
            pos++;
        }

        Scanner scan = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);
        for (int counter = 0;counter<10;counter++) {
            System.out.println("Please enter 1 to look for a word or 2 to look for a position");
            int choose = scan.nextInt();
            if (choose == 1) {
                String voc = number2.nextLine();
                for (int ind = 0; ind < words.length; ind++) {
                    if (voc == words[ind]) {
                        System.out.println(voc + " is in position " + ind);
                    } else {
                        System.out.println("-1");
                        break;
                    }
                }
            } else if (choose == 2) {
                int num = scan.nextInt();
                if (words[num] != null) {
                    System.out.println("The word in position " + num + " is " + words[num]);
                } else if (words[num] == null){
                    System.out.println("-1");
                }
            }
        }
    }
}