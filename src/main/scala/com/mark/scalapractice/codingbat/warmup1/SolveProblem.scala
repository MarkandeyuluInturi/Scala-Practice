package com.mark.scalapractice.codingbat.warmup1

object SolveProblem {

  //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
  // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
  //sleepIn(false, false) → true
  //sleepIn(true, false) → false
 // sleepIn(false, true) → true

  def sleepIn(weekday:Boolean,vacation:Boolean):Boolean={
    if(!weekday || vacation) true else false
  }

  /*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
  We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
  monkeyTrouble(true, true) → true
  monkeyTrouble(false, false) → true
  monkeyTrouble(true, false) → false*/

  def monkeyTrouble(aSmile:Boolean,bSmile:Boolean):Boolean={
    if((aSmile & bSmile) || (!aSmile & !bSmile)) true else false
  }

  /* Given two int values, return their sum. Unless the two values are the same, then return double their sum. */

  def sumDouble(a:Int,b:Int):Int={
    val sum=a+b
    if(a ==b) sum*2  else sum
  }
  def main(args : Array[String]) {
    //println(sleepIn(false,false))
    //println(sleepIn(true,false))
   // println(sleepIn(false,true))


    /*println(monkeyTrouble(false,false))
    println(monkeyTrouble(true,true))
    println(monkeyTrouble(false,true))
    println(monkeyTrouble(true,false))*/

    print(sumDouble(1,2))
    print(sumDouble(3,4))
    print(sumDouble(2,2))
  }
}
