package com.jack;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Java !!!");
        Person p = new Person(70.1f, 1.81f);
        Person p2 = new Person("Jack", 75.1f, 1.81f);
        p.hello();
        System.out.println(p.bmi());
        System.out.println(p2.bmi());
        // 基本資料型態 primitive types
        /*short s = 0;                    // 16 bits
        int i = 1;                      // 32 bits
        long l = 2;                     // 64 bits
        char c = 'j';                   // 16 bits
        byte b = 120;                   //  8 bits
        float f = 70.1f;                // 32 bits
        double d = 180.1;               // 64 bits
        boolean adult = true;
        // 參照資料型態 Reference data type
        String name = "Jack";
        Integer age = 27;
        Character c2 = 'a';
        Float f2 = 81.5f;
        Double d2 = 12.2;*/
    }
}