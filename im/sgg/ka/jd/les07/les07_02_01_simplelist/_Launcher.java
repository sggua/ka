package im.sgg.ka.jd.les07.les07_02_01_simplelist;

import org.omg.CORBA.Object;

import java.util.Iterator;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

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

        for (Iterator<java.lang.Object> i = list.iterator(); i.hasNext() ; ){
            System.out.println(i.toString());
            i = (Iterator<java.lang.Object>) i.next();
        }



    }
}
