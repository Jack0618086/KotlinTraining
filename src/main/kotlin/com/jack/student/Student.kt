package com.jack.kotlin

import java.util.Scanner

fun main() {
//    userInput()
    val stu = Student("10", "Oscar", 70, 90)
    val stu2 = Student("11", "Ku", 80, 60)
    stu.print()
    println("High score: " + stu.highest())
    stu2.print()
    println("High score: " + stu2.highestV2())
}

// 括號裡面定義屬性 (property)
class Student (var id:String?, var name:String, var english:Int, var math:Int) {
    fun print () {
        println(
            (id + "\t" + name + "\t" + english + "\t" + math +
                    "\t" + "總平均 :" + "\t" + (english + math) / 2))
    }
    fun printV2() {
        println("$id\t$name\t$english\t$math\t總平均:\t${(english + math) / 2}")
    }

    fun nameCheck() {
        println(id?.length)
    }

    fun highest () : Int {
        var max = if (english>math) english else math
        /*if (english>math) {
            max = english
        } else {
            max = math
        }*/
        return max;
    }

    fun highestV2 () : Int {
        var max = if (english>math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
        /*if (english>math) {
            max = english
        } else {
            max = math
        }*/
        return max;
    }
}



private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter a id: ")
//    var id = scanner.next()
    var id = null
    print("Please enter a name: ")
    var name = scanner.next()
    print("Please enter english score: ")
    var english = scanner.nextInt()
    print("Please enter math score: ")
    var math = scanner.nextInt()

    val stu = Student(id, name, english, math)
    stu.print()
    stu.printV2()
    stu.nameCheck()
}