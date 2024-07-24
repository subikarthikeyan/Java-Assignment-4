package com.university.management;

public class Main {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "ara", 20, "Computer Science");
            System.out.println("Student created: " + student1.getName());

            // This will throw AgeNotWithinRangeException
            Student student2 = new Student(2, "arun", 22, "Mathematics");

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try {
            // This will throw NameNotValidException
            Student student3 = new Student(3, "aravind ", 18, "Physics");

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
