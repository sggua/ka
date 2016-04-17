package im.sgg.ka.jd.les07.les07_01_05_classroom;

import java.util.*;


public class Classroom {
    List <Student> students;

    public Classroom() {
        this(null);
    }

    public Classroom(List<Student> students) {
        this.students = students;
        if (students==null) this.students = new ArrayList<>();
    }

    ///////////////////////////////////////////////////////////////////

    public void enter(Student s) {
        if (! isPresent(s)) {
            this.students.add(s);
        }
    }

    public void leave(Student s) {
        if ( isPresent(s)) {
            this.students.remove(s);
        } else {
            System.out.println("There is no student "+s.toString()+" in the classroom.");
        }

    }

    public int getStudentCount(){
        return this.students.size();
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
            if (student!=null) System.out.println(student.toString());
        }
        System.out.println("Total students in the classroom: "+getStudentCount()+"\n");
    }

    private boolean isClassOk (){
        return this.students == null ? false : true;

    }



    ///////////////////////////////////////////////////////////////////

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
