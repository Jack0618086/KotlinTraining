package com.jack

fun main () {
    var s: String? = "abcde"
    println(s?.length)       // 安全呼叫，結果為 5
    println(s?.get(3))       // 安全呼叫，結果為 'd'
    println(s?.substring(3)) // 安全呼叫，結果為 "de"

    s = null
    println(s?.length)       // 結果為 null
    // println(s!!.length)   // 會拋出 NullPointerException

//    println("Hello Kotlin !!!");
//    Human().hello();

    val h = Human(weight = 7.5f, height = 1.81f) // 建構一個 human 物件
    println(h.bmi())
    h.hello()
    val score = 88
    println(score > 60)
    val c : Char = 'A'
    print(c.code > 60)
    print(c.toInt() > 60)
    /*val 名稱 : 型態 = 值 ( age / age2 的意思是一樣的 )
    val age : Int = 27;
    val age2 = 28;
    val name = "Jack";
    var nam2 : String;
    nam2 = "Hank";*/
}
// primary constructor
// 設計成需要三個變數才能建構所以 val h 會報錯
//如果 name 要放在最前面，那麼可以向上面一樣宣告身高體中的值，如果寫在最後面則不用
class Human(var name: String = "", var weight: Float, var height: Float) {
    init {
        println("test $weight")
    }
    // secondary constructor
//    constructor(name: String, weight: Float, height: Float) : this(weight, height)
    fun bmi() : Float {
        var bmi = weight / (height * height)
        return  bmi
    }

    fun hello () {
        println("Hello Human !!!")
    }
}