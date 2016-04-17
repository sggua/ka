package im.sgg.ka.jd.les07.les07_01_05_classroom;

import java.util.*;

/**
 * Created by sergiy on 17.04.16.
 * Java Developer lessons
 * kademika.com
 */
public class Classroom {
    List <Student> students;
    private int inClass;

    public Classroom() {
        this(null);
    }

    public Classroom(List<Student> students) {
        this.students = students;
        this.inClass = 0;
        if (students==null) this.students = new ArrayList<>();
        if (students!=null) this.inClass = students.size();
    }

    ///////////////////////////////////////////////////////////////////

    public void enter(Student s) {
        if (! isPresent(s)) {
            this.students.add(s);
            this.inClass++;
        }
    }

    public void leave(Student s) {
        if ( isPresent(s)) {
            this.students.remove(s);
            this.inClass--;
        } else {
            System.out.println("There is no student "+s.getName()+" "+s.getSecondName()+" in the classroom.");
        }

    }

    public int getStudentCount(){
        return getInClass();
    }

    public boolean isPresent (Student s) {
        if (s==null || ! isClassOk() ) return false;
        for (Student student : this.students ) {
            if (student!=null && student.equals(s)) return true;
        }
        return false;
    }

    // print all students
    public void printStudentInfo(){
        if (! isClassOk() ) return;
        for (Student student : this.students ) {
            if (student!=null) {
                System.out.println(student.getName()+ " "+ student.getSecondName());
            }
        }
        System.out.println("Total students in the classroom: "+getStudentCount()+"\n");
    }

    private boolean isClassOk (){
        return this.students == null ? false : true;

    }



    ///////////////////////////////////////////////////////////////////

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getInClass() {
        return inClass;
    }

    public void setInClass(int inClass) {
        this.inClass = inClass;
    }
}
