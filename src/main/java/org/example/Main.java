package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("1", "Max Mustermann", "Musterstraße 1", 1.5);
        Student student2 = new Student("2", "Erika Mustermann", "Beispielstraße 2", 2.0);
        Student student3 = new Student("3", "John Doe", "Hauptstraße 3", 2.3);

        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
        System.out.println("Student 3: " + student3);
        String lehrerName = "Dr. Müller";
        Course course = new Course(101, "Informatik", lehrerName, Arrays.asList(student1, student2, student3));

        // Ausgabe des Kurses
        System.out.println("\nKurse Infotmation: " + course );

        // Zugriff auf Kursdetails
        System.out.println("Kurs ID: " + course.getId());
        System.out.println("Kurs Name: " + course.getName());
        System.out.println("Kurs Lehrer: " + course.getTeacher());
        System.out.println("Anzahl der Studenten: " + course.getStudents().size());

        //Builder
        Student studentN1 = Student.builder()
                .id("1")
                .name("Minana Justus")
                .addresse("Musterstraße 1")
                .note(1.5)
                .build();

        Student studentN2 = Student.builder()
                .id("2")
                .name("Tanja Justus")
                .addresse("Beispielstraße 2")
                .note(2.0)
                .build();

        // Mit der @With-Annotation Änderungen vornehmen
        Student updatedStudent1 = studentN1.withName("Milana Justus").withNote(2.0);
        Student updatedStudent2 = studentN2.withName("Tanja Justus").withNote(1.0);

        // Ausgabe der Studenten
        System.out.println("Original Student 1: " + studentN1);
        System.out.println("Updated Student 1: " + updatedStudent1);

        // Erstellung eines Lehrers
        Lehrer lehrer = Lehrer.builder()
                .name("Dr. Schill")
                .fach("Mathematik")
                .build();

        // Erstellung eines Kurses mit dem Builder-Muster
        Course course1 = Course.builder()
                .id(201)
                .name("Mathematik")
                .teacher(lehrer.name())
                .students(Arrays.asList(studentN1, studentN2))
                .build();
        // Ausgabe des Kurses
        System.out.println("\nKurs Information: \n " + course+"\n_______\n "+course1);
    }
}