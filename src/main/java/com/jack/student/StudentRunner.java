package com.jack.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student stu = new Student("06", "Jack", 90, 70);
        stu.print();
        System.out.println("High Score: " + stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a id");
        String id = scanner.next();
        System.out.println("Please enter a name");
        String name = scanner.next();
        System.out.println("Please enter english score");
        int english = scanner.nextInt();
        System.out.println("Please enter math score");
        int math = scanner.nextInt();
        Student stu = new Student(id, name, english, math);
        stu.print();
        System.out.println("High score: " + stu.highest());
    }
}