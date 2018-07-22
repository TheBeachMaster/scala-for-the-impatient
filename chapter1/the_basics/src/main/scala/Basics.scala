package com.chapter1.basics

object Main extends App {
    println("Hello World to the basics")

    // Declaring Variables
    // It is an error to declare avariable wthout initializing it

    val arith = 8 * 5 + 2 // This is a constant variable
    println("The answer to 8 * 5 + 2 is: " + arith)

    // To declare a variable whose value may change we use var

    var num = 8 * 5 + 2
    println("The initial value of num is: " + num)
    num = num * 2
    println("New value of num is: " + num)

    // Type declarations
    var greeting: String = null
    greeting = "Hello, I am a string"
    val greetings: Any = "What's up?"
    println("Here is your greeting: " + greeting)
    println("Here are your greetings: " + greetings)

    // It is possible to chain multiple variables together
    val dimX, dimY, dimZ : Int = 100
    var volume, area: Int = null

    volume = dimX * dimY * dimZ
    area = dimx * dimY

    println("Total volume is: " + volume + " cubic centimeters")
    println("Total area is: " + area + " square centimeters")

    println("20 to 30" + 20 to 30)

    val bigX: BigInt = 123456789
    println("Big int: " + bigX * bigX * bigX)

    
}