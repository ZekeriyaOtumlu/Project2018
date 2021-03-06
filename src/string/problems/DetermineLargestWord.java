package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {

        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";

        System.out.println(findTheLargestWord(s));
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
       }


    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        String[] arr = wordGiven.split(" ");
        for (String str: arr) {

            if (map.get(str) == null){
                map.put(str.length(),str);
            }

        }

        int max = 0;
        String word = null;

        for (Map.Entry entry: map.entrySet()) {
            if ((int)entry.getKey() > max){
                max = (int)entry.getKey();
                word = (String) entry.getValue();
            }
        }


        return map;
    }
}