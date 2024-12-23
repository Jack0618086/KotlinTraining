package com.jack.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String id, String name, int english, int math) {
        this.id = id;
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest () {
        int max = (english>math) ? english:math;
//        int max = Math.max(english, math); 調用 Math 類中的靜態方法 max(int a, int b)，直接返回兩個值中的較大者
        /*if (english>math){
            max = menglishath;
        } else {
            max = math;
        }*/

        return max;
    }

    public void print(){
        System.out.println(id + "\t" + name + "\t" + english + "\t" + math +
                "\t" + "總平均 :" + "\t" + getAverage());
        System.out.print("Pass or Filed: ");
        if (getAverage() >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
        }
    }

    public int getAverage(){
        return (english+math)/2;
    }
}