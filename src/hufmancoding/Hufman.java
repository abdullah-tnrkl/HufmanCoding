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


import java.util.PriorityQueue;
import java.util.Scanner;
public class Hufman {
public static void yazdır(Hufmanndugum root, String s) {

        int[] Frek = {50, 35, 20, 10, 8, 4};

        if (root.sol
                == null
                && root.sağ
                == null
                && Character.isLetter(root.a)) {

    

            System.out.println(root.a + ":" + s);
             

            return;
        }
       

        yazdır(root.sol, s + "0");
        yazdır(root.sağ, s + "1");
    }
    
    
}


