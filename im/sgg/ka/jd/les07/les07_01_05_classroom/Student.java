package im.sgg.ka.jd.les07.les07_01_05_classroom;

/**
 * Created by sergiy on 17.04.16.
 * Java Developer lessons
 * kademika.com
 */
public class Student {
    private String name;
    private String secondName;

    public Student() {
        this(null,null);
    }

    public Student(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
