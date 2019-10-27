package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class FasterSort {

    public static void main(String[] args) {

        LinkedList<String> alpha = new LinkedList<String>();
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
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println(h);
            System.out.println(i);
            System.out.println(j);
            System.out.println(k);
            System.out.println(l);
            System.out.println(m);
            System.out.println(n);
            System.out.println(o);
            System.out.println(p);
            System.out.println(q);
            System.out.println(r);
            System.out.println(s);
            System.out.println(t);
            System.out.println(u);
            System.out.println(v);
            System.out.println(w);
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);


            //           if (word.compareTo(alpha.get(ind)) < 0) {
            //           alpha.add(ind, word);
            //           break;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println(a.size()+b.size()+c.size()+d.size()+e.size()+f.size()+g.size()+h.size()+i.size()+j.size()+k.size()+l.size()+m.size()+n.size()
        +o.size()+p.size()+q.size()+r.size()+s.size()+t.size()+u.size()+v.size()+w.size()+x.size()+y.size()+z.size());
    }
}