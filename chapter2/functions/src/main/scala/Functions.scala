package com.chapter2.funcs

object Main extends App {
    // Defining a func
    def absTwiceDouble(num: Double) : Double = {
        num * 2.00
    }

    // Providing default Arguments to a function
    def stringDecorate(str: String, left: String = "{", right: String = "}") =
        left + str + right

    def loopFunc(valBase: Int, valLim: Int) : Int = {
        var baseVal = valBase
        for (iter <- 1 to valLim)
            baseVal = baseVal * iter
        baseVal     

    }

    /**
     * Variable Arguments
     * These are useful for functions that take a "variable number of args"
     */

    def multiplyVar(args: Int*) : Int = {
        var res = 0
        for (arg <- args) res += arg 
        res
    }

    /**
    * In Scala functions that do not return a type are called procedures and the return type is Unit
    */

    def borderString(str: String) : Unit = {
        val brdr = "-" * (str.length + 2)
        println(f"$brdr%n|$str|%n$brdr%n")
    }

    /**
    * Lazy values are deferred until they are accessed
    * They get evaluated only when called for the first time.
    * However, they are evaulated everytime they are accessed,even if they had been  initilized before
    */

    lazy val txt = scala.io.Source.fromFile("/home/kennedy/Documents/git/scala-for-the-impatient/chapter2/functions/src/main/res/read.txt").mkString

     // Print results of our functions
     val dNum     = absTwiceDouble(6.38)
     val dString  = stringDecorate("Catsnip")
     val dString2 = stringDecorate("Catsnip", "||", "||") 
     // Named Arguments
     val dString3 = stringDecorate(left = "(", str = "Catsnip", right = ")")  
     // Using Variable functions
     val sum1     = multiplyVar(5, 8, 15, 97, 400)
     val sum2     = multiplyVar(3, 8, 5)
     // Using Variable arguments for a sequence of values
     val sumSeq   = multiplyVar(1 to 15:_*)
     val iterFunc = loopFunc(3, 8)
     //val strPrim  = MessageFormat.format("The answer to {0} is {1}", "everything", 42.asInstanceOf[AnyRef])

     println(s"6.38 Doubled is : $dNum")
     println(s"Decorated String Catsnip is $dString")
     println(s"Further decorated string Catsnip is $dString2")
     println(s"Even further decorated string Catsnip is: $dString3")
     println(s"Variable function result for Op1 is: $sum1")
     println(s"Var Func Op2 is: $sum2")
     println(s"Using sequenced values we get: $sumSeq")
     println(s"Iterating 3 8 times gives: $iterFunc")
     borderString("Wooooh")
     println(s"We got: $txt")
}