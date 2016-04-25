package im.sgg.ka.jd.les07.les07_02_16_comparator;


/**
 * Created by sergiy on 25.04.16.
 * Java Developer lessons
 * kademika.com
 */
public class Comparator implements java.util.Comparator <Object> {


    @Override
    public int compare(Object o1, Object o2) {
        String strO1, strO2;
        try {
            strO1 = o1.toString();
        } catch (NullPointerException n) {
            System.out.println("ERROR:\t Object1 is null");
            return 0;
        }
        try {
            strO2 = o2.toString();
        } catch (NullPointerException n) {
            System.out.println("ERROR:\t Object2 is null");
            return 0;
        }
        // sort
//        for (int i=0;i<strO1.length() && i<strO2.length();i++){
//            if ( strO1.charAt(i) < strO2.charAt(i)) return -1;
//            if ( strO1.charAt(i) > strO2.charAt(i)) return 1;
//        }
        // reverse sort
        for (int i=0;i<strO1.length() && i<strO2.length();i++){
            if ( strO1.charAt(i) < strO2.charAt(i)) return 1;
            if ( strO1.charAt(i) > strO2.charAt(i)) return -1;
        }
        return 0;
    }
}
