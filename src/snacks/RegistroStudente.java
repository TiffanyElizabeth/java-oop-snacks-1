package snacks;

import snacks.Studente;

public class RegistroStudente {
    protected Studente[] students;

    // constructor
    public RegistroStudente() {
        this.students = new Studente[0];
    }

    // method to add a student
    public void addStudent(String firstName, String lastName, int age) {
        Studente[] revisedStudents = new Studente[this.students.length + 1];

        int i = 0;

        while (i < students.length) {
            revisedStudents[i] = students[i];
            i++;
        }

        revisedStudents[i] = new Studente(firstName, lastName, age);

        this.students = revisedStudents;
    }

    // method to give list of all students
    public void studentsList() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].fullNameAge());
        }
    }

}
