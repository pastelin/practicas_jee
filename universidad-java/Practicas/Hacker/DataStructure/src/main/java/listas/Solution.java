/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tmaño");
        long size = scanner.nextLong();

        Map<Long, Long> map = new HashMap<>();
        long operations = scanner.nextLong();

        for (long i = 0; i < operations; i++) {
            long start = scanner.nextLong();
            long end = scanner.nextLong();
            long value = scanner.nextLong();

            map.put(start, (map.containsKey(start) ? map.get(start) : 0) + value);
            map.put(end + 1, (map.containsKey(end + 1) ? map.get(end + 1) : 0) - value);
        }

        long max = 0;
        long value = 0;
        for (long i = 0; i < size; i++) {
            value += (map.containsKey(i + 1) ? map.get(i + 1) : 0);
            max = Math.max(max, value);
        }

        System.out.println(max);
    }
    
}
