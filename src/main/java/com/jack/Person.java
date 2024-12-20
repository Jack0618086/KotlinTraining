package com.jack;

public class Person {
    String name; // name 是 person 身上的一個屬性
    float height;
    float weight;

    public Person (float weight, float height) {
        this.height = height; // 暗紫色通常代表屬性
        this.weight = weight;
    }
    public Person (String name, float weight, float height) {
        this(height,weight); // 這個方法一定要在建構子的第一行
        this.name = name;
    }

    public float bmi () {
        float bmi = weight / (height * height);
        return bmi;
    }

    public void hello (){
        System.out.println("Hello Jack !!!");
    }
}
