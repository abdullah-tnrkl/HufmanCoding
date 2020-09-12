/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hufmancoding;

/**
 *
 * @author abdul
 */


import static hufmancoding.Hufman.yazdır;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

class Hufmanndugum {

    private static Object hn;
    private static Object hd;

    public static void main(String[] args) {

        int n = 6;
        char[] karakter = {'a', 'b', 'k', 'm', 'd', 'g'};
        int[] Frek = {50, 35, 20, 10, 8, 4};

        PriorityQueue<Hufmanndugum> q
                = new PriorityQueue<Hufmanndugum>(n, new MyComparator());

        for (int i = 0; i < n; i++) {

            Hufmanndugum hd = new Hufmanndugum();

            hd.a = karakter[i];
            hd.veri = Frek[i];

            hd.sol = null;
            hd.sağ = null;

            q.add(hd);
        }

        Hufmanndugum root = null;

        while (q.size() > 1) {

            Hufmanndugum x = q.peek();
            q.poll();

            Hufmanndugum y = q.peek();
            q.poll();

            Hufmanndugum f = new Hufmanndugum();

            f.veri = x.veri + y.veri;
            f.a = '-';

            f.sol = x;

            f.sağ = y;

            root = f;

            q.add(f);
        }

        yazdır(root, "--");
         char[] aa = {'a', 'b', 'k', 'm', 'd', 'g'};
         for (int i = 0; i < Frek.length; i++) {
            System.out.println(aa[i]+"-- frekans: " + Frek[i] + " bit sayisi="+i);
        }
    }

    int veri;
    char a;

    Hufmanndugum sol;
    Hufmanndugum sağ;
}

class MyComparator implements Comparator<Hufmanndugum> {

    public int compare(Hufmanndugum x, Hufmanndugum y) {

        return x.veri - y.veri;
    }
}

public class Hufmancoding {
    

    

}
