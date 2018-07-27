package com.chapter2.control

import scala.math._
import scala.io.StdIn


object Main extends App {
    // Conditionals
    val x : Int = 20
    var mut : Int = 0
    if(x > 0) mut = 1 else mut= -1 
    println("Mut is given as : " + mut)

    // The above can be expressed as
    val mut1 = if( x > 0) 1 else -1
    println("Mut is still: " + mut1)

    // To return a non-useful value
    val mut2 = if(x > 0) "Massive" else ()
    println("Mut is: " + mut2)

    // Block Expr
    val x0 : Int = 8
    val y : Int = 47
    val y0 : Int = 10

    val distance = { val dx = x -x0; val dy = y - y0; sqrt(dx * dx + dy * dy) }
    println("The distance is given as: " + distance)

    // Standard IO
    // String interpolation
    val name : String = "Arthur"
    val age : Int = 500
    print(f"Hello, $name! You're super old, like ${age * 0.05}%7.2f years old.%n")

    // Get user input and print it out
    val vcs = StdIn.readLine("Enter your fav VCS ")
    // Other methods from the StdIn class do not take prompts
    // Other memebrs of the StdIn class readByte, readShort, readBoolean, readChar
    print("Number of repos: ")
    val numRepo = StdIn.readInt()
    println(s"Looks like you like ${vcs} with ${numRepo} repos")

    // Loops in scala are not commonly used
    // Scala does not have for(init; test;update) construct
    val n : Int = 10
    var r : Int = 1
    for(i <- 1 to n)
    {
        r = r * i
        println(s"Current value of i is $i")
    } 


    // Let's traverse a string
    val s : String = "Hello huge string"
    var sum : Int = 10
    for(i <- 0 to s.length -1)
    {
        sum += s(i)
        println(s"Sum is $s and index is ${s(i)}")
    }

    // Using generators in the form var<-expr
    for(i <- 1 to 3; j <- 1 to 3)
    {
        println(f"${10 * i +j}%3d")
    }

    // You can setup giards (booleans) for gens as so
    for(i <- 1 to 3; j <- 1 to 3 if i != j)
    {
        println(f"${10 * i +j}%3d")
    }

    // Introduce definitions
    for(i <- 1 to 3; ran = 4 - i; j <- ran to 3)  
    {
        println(f"${10 * i + j}%3d")
    }

    // Comprehension loops
    for(i <- 1 to 10) yield i % 3

    for(c <- 0 to 1; i <- "Whatsup") yield (i + c).toChar


}