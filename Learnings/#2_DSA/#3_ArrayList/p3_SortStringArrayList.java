// write a program to sort an arraylist of strings
// in descending order

import java.util.ArrayList;
import java.util.Collections;

public class p3_SortStringArrayList {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        // sort it in decending order using collection class
        l.add("hey");
        l.add("to");
        l.add("apart");
        l.add("nvidea");
        System.out.println(l);
        Collections.sort(l, Collections.reverseOrder());
        // Collections.sort(l);
        System.out.println(l);//lexico-graphical order sorting
        // these methods can be applied to different type of
        // objects..
    }
}
