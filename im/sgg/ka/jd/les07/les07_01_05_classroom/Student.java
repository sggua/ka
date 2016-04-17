package im.sgg.ka.jd.les07.les07_01_05_classroom;


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

    ///////////////////////////////////////////////////////

    @Override
    public String toString(){
        return this.getName()+" "+this.getSecondName();
    }

    ///////////////////////////////////////////////////////


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
