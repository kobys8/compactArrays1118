/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compactarrays1118;

/**
 *
 * @author kms080
 */
import java.io.*;
import java.util.*;
public class CompactArrays1118 {
    public static void main(String[] args) {
        try {
            File f = new File("compact.txt");
            Scanner in = new Scanner(f);
            int length = 0;
            int i;
            List<Integer> compactNums = new ArrayList();
            while(in.hasNextInt()) {
                compactNums.add(in.nextInt());
                length++;
            }
            for(i = 0; i < compactNums.size(); i++) {
                System.out.print(compactNums.get(i) + " ");
            }
            for(i = 0; i < compactNums.size(); i++) {
                if(compactNums.get(i) == 0) {
                    for(int j = i; j < compactNums.size() - 1; j++) {
                       compactNums.set(j, compactNums.get(j + 1)); 
                    }
                }
            }
            System.out.println("\n");
            for(i = 0; i < compactNums.size(); i++) {
                System.out.print(compactNums.get(i) + " ");
            }
        }
        catch(Exception e) {
            System.out.println("ERROR: " + e);
        }
    }
}