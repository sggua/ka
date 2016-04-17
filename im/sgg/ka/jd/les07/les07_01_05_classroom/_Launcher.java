package im.sgg.ka.jd.les07.les07_01_05_classroom;

/**
 * Created by sergiy on 17.04.16.
 * Java Developer lessons
 * kademika.com
 */
public class _Launcher {

    public static void main(String[] args) {

        Classroom classroom = new Classroom();
        classroom.printStudentInfo();

        Student[] students = new Student[5];
        students[0]=new Student("John", "White");
        students[1]=new Student("Tim", "Brown");
        students[2]=new Student("Sean", "Doyle");
        students[3]=new Student("Greg", "List");
        students[4]=new Student("Simon", "Wales");

        classroom.enter(students[0]);
        classroom.enter(students[1]);
        classroom.printStudentInfo();

        classroom.enter(students[2]);
        classroom.enter(students[3]);
        classroom.enter(students[3]);
        classroom.enter(students[3]);
        classroom.enter(students[4]);
        classroom.printStudentInfo();

        classroom.leave(students[1]);
        classroom.leave(students[2]);
        classroom.leave(students[1]);
        classroom.leave(students[3]);
        classroom.printStudentInfo();


    }
}
