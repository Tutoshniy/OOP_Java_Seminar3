import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentStream;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        Student s11 = new Student("Максим", 20);
        Student s12 = new Student("Арсений", 21);
        Student s13 = new Student("Евгений", 22);
        Student s14 = new Student("Аркадий", 23);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s11);
        listStud2.add(s12);
        listStud2.add(s13);
        listStud2.add(s14);

        StudentStream stream = new StudentStream(1);

        StudentGroup group5123 = new StudentGroup(listStud, 5123);
        StudentGroup group5124 = new StudentGroup(listStud2, 5124);
        stream.addGroup(group5124);
        stream.addGroup(group5123);

        // Collections.sort(stream.getGroups());
        for (StudentGroup g : stream) {
            System.out.println(g);
            for (Student s : g) {
                System.out.println(s);
            }
        }

        // System.out.println(group5123);
        // for (Student s: group5123) {
        // System.out.println(s);
        // }
        // System.out.println();
        // System.out.println();

        // Collections.sort(group5123.getGroup());

        // for (Student s: group5123) {
        // System.out.println(s);
        // }

    }
}
