package Arraylist;

import java.util.*;

public class D2 {
    public static void main(String[] args) {
        Set s = new TreeSet<String>(new D3());
        s.add("guru");
        s.add("anand");
        s.add("mohammed");
        s.add("ganesh");
        s.add("sreeni");
        System.out.println(s);
        for (Object s1 : s)
            System.out.println(s1);

    }
}
    class D3 implements Comparator<String> {
        public int compare(String s1, String s2) {
            return (s2.compareTo(s1));
        }
    }





