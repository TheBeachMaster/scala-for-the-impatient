package com.chapter1.basics

import scala.math._
import scala.util.Random
import scala.BigInt.probablePrime

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
    var volume, area: Int = 0

    volume = dimX * dimY * dimZ
    area = dimX * dimY

    println("Total volume is: " + volume + " cubic centimeters")
    println("Total area is: " + area + " square centimeters")

    // TODO 
    println("20 to 30: " + 20.to(30))

    val bigX: BigInt = 123456789
    println("Big int: " + bigX * bigX * bigX)

    // Excercises
    var myString : String = "crazy"
    myString = myString * 3
    println("The result of multplying a string with an int is: " + myString)

    val maxU : Any = 10 max 2
    println("10 max 2 is: " + maxU)

    val bigNumX : BigInt = BigInt(2) pow 1024
    println("2 power 1024 is: " + bigNumX)

    var primeNum : BigInt = 0
    primeNum = probablePrime(100, Random)
    println(" The probable prime is: " + primeNum)

    var fileNameN : BigInt = 1234567890 * 1239874560
    var fileNameS : String = null

    fileNameS = fileNameN.toString(36)

    println("Your File name is: " + fileNameS)

    val myStr : String = "MyString"

    val fChar : Any = myStr.head
    val lChar : Any = myStr.last

    println("First Letter of " + myStr + " is: " + fChar + " and last letter is: " + lChar)

}