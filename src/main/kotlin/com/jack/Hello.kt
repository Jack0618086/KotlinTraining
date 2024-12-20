package com.jack

fun main () {
//    println("Hello Kotlin !!!");
//    Human().hello();
    val h = Human(70.2f, 1.81f) // 建構一個 human 物件
    println(h.bmi())
    h.hello();
    /*val 名稱 : 型態 = 值 ( age / age2 的意思是一樣的 )
    val age : Int = 27;
    val age2 = 28;
    val name = "Jack";
    var nam2 : String;
    nam2 = "Hank";*/
}

class Human(var weight : Float, var height : Float) {
    fun bmi() : Float {
        var bmi = weight / (height * height)
        return  bmi;
    }

    fun hello () {
        println("Hello Human !!!")
    }
}