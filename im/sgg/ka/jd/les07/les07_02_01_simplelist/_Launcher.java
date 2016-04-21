package im.sgg.ka.jd.les07.les07_02_01_simplelist;

import java.util.Iterator;

/**
 * Created by sergiy on 20.04.16.
 * Java Developer lessons
 * kademika.com
 */
public class _Launcher {
    public static void main(String[] args) {

        SimpleLinkedList list = new SimpleLinkedList();

        String first = "first";
        String str10 = "str10";
        String last = "last";

        list.addAfter("str01",first);
        list.addFirst("str1");
        list.printList();

//        list.addAfter("str02",first);  //  IllegalStateException

        list.printList();


        list.addFirst("str2");
        list.addFirst("str3");
        list.addFirst(first);

        list.printList();


        list.addLast(str10);
        list.addLast("str11");
        list.addLast("str12");
        list.addLast(last);

        list.printList();

        list.addAfter("str20",last);
        list.addAfter("str21",first);
        list.addAfter("str22",str10);

        list.printList();

//        System.err.println("for 1");
//        for (Object o: list) {
//            String s = (String) o;
//            System.out.println(s);
//        }
//
//        System.err.println("for 2");
//
//        for (Iterator<Object> i = list.iterator(); i.hasNext() ; ){
//            Object o = i.next();
//            System.out.println(o);
//        }

        list.printList();
        list.remove(str10);
        list.printList();
        list.remove("str22");
        list.printList();


    }
}
