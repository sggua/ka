package im.sgg.ka.jd.les07.les07_02_16_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _Launcher {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        initList(list);

        list.add(null);
        list.add("Iaoe");
        list.add("Iiiiii");


        System.out.println("Source list");
        printList(list);

        Collections.sort(list, new Comparator());

        System.out.println("Sorted list");
        printList(list);


    }

    private static void printList(List<String> list) {
        for (String str:list ) {
            System.out.println(str);
        }
    }

    static void initList (List l){
        for (char ch='A' ; ch <='J' ; ch++) {
            l.add("" + ch + lower(ch) + lower(ch) + lower(ch));
        }

    }
    static char lower(char c){
        return (char)(c+ ' ');
    }
}
