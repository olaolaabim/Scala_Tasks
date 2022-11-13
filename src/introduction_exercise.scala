object introduction_exercise {
  def main(args: Array[String]): Unit = {
    // Introduction

    println(2 + 3)      //addition(+)
    println(3 - 1)      //subtraction(-)
    println(2 * 3)      //multiplication(*)
    println(3 / 2)      //division(/) it returns an Int
    println(scala.math.pow(3,2)) //exponential(math.pow)// returns a double type
    println(3 % 2)      //modulus(%)
    println((3 / 2).floor) // Floor division operator(.floor)#Checking data types

    //Checking data types
    println((10).getClass) //Int
    println((3.14).getClass) //Float
    println((true).getClass) //Boolean
    //no concept for complex number
    println(("Asabeneh").getClass)
    // Scala forces a data type declaration before use

  }
}
