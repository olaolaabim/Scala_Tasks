import scala.math
object operators_practice {
  def main(args: Array[String]): Unit = {
    println(true)
    println(false)

    //Arithmetic Operations in Python
    //Integers

    println("Addition:", 1 + 2) //3
    println("Subtraction:", 2 - 1) //1
    println("Multiplication:", 2 * 3) //6
    println("Division:", 4 / 2) //2 Division in Scala gives Integer number except one of the input is a floating point number
    println("Division:", 6 / 2) //3
    println("Division:", 7 / 2) //3
    println("Division without the remainder:", (7 / 2).floor)   // 3.0,  gives without the floating number or without the remaining
    println("Division without the remainder:", (7 / 3).floor)   // 2.0
    println("Modulus:", 3 % 2) //1 Gives the remainder
    println("Exponentiation:",math.pow(2,3)) //8.0 it means 2 * 2 * 2

    //Floating numbers
    println("Floating Point Number, PI", 3.14)
    println("Floating Point Number, gravity", 9.81)

    //Complex numbers
    //NOt Applicable to Scala

    //Declaring the variable at the top first

    val a = 3 // a is a variable name and 3 is an integer data type
    val b = 2 // #b is a variable name and 3 is an integer data type
    //Arithmetic operations and assigning the result to a variable
    var total = a + b
    var diff = a - b
    var product = a * b
    var division = a / b
    var remainder = a % b
    var floor_division = (a / b).floor
    var exponential = math.pow(a, b)


    println(total)    //
    println("a + b =", total)
    println("a - b =", diff)
    println("a * b =", product)
    println("a / b =", division)
    println("a % b =", remainder)
    println("a // b = ", floor_division)
    println ("a ** b =", exponential)
    println("== Addition, Subtraction, Multiplication, Division, Modulus ==")


    //Declaring values and organizing them together
    val num_one = 3
    val num_two = 4

    //Arithmetic operations
    total = num_one + num_two
    diff = num_two - num_one
    product = num_one * num_two
    division = num_two / num_one
    remainder = num_two % num_one

    //Printing values  with label
    println("total:", total)
    println("difference:", diff)
    println("product:", product)
    println("division:", division)
    println("remainder:", remainder)

    //Calculating area of a circle
    val radius = 10 //radius of a circle
    val area_of_circle = 3.14 * radius * radius //two * sign means exponent or power
    println("Area of a circle:", area_of_circle)

    //Calculating area of a rectangle
    var length = 10
    var width = 20
    val area_of_rectangle = length * width
    println("Area of rectangle:", area_of_rectangle)

    //Calculating a weight of an object
    var mass= 75
    var gravity = 9.81
    val weight = mass * gravity
    println(weight, "N") //Adding unit to the weight

    //Calculate the density of a liquid
    mass = 75  //in Kg
    var volume = 0.075 //in cubic meter
    var density = mass / volume //1000 Kg / m ^3
    println(density)


    println(3 > 2)    //True, because 3 is greater than 2
    println(3 >= 2)   //True, because 3 is greater than 2
    println(3 < 2)    //False, because 3 is greater than 2
    println(2 < 3)    //True, because 2 is less than 3
    println(2 <= 3)   //True, because 2 is less than 3
    println(3 == 2)   //False,because 3 is not equal to 2
    println(3 != 2)   //True, because 3 is not equal to 2
    println(("mango").length == ("avocado").length ) //False
    println(("mango").length != ("avocado") ) //True
    println(("mango").length < ("avocado").length ) //True
    println(("milk").length != ("meat").length ) //False
    println(("milk").length == ("meat").length ) //True
    println(("tomato").length == ("potato").length) //True
    println(("python").length > ("dragon").length ) //False

    //Comparing something gives either a True or False
    println("True == True:", true == true)
    println("True == False:", true == false)
    println("False == False:", false == false)

    // is and is not are not applicable to scala
    // in and not in not applicable in scala


    println(3 > 2 && 4 > 3)     //True - because both statements are true
    println(3 > 2 && 4 < 3)     //False - because the second statement is false
    println(3 < 2 && 4 < 3)     //False - because both statements are false
    println("True and True:", true && true)
    println(3 > 2 || 4 > 3) //True - because both statements are true
    println(3 > 2 || 4 < 3) //True - because one of the statements is true
    println(3 < 2 || 4 < 3) //False - because both statements are false
    println("True or False:", true || false)
    println (!(3 > 2))   //False - because 3 > 2 is true , then not True gives False
    println (! true)  //false - Negation, the not operator turns true to false
    println(! false)  //True

  }
}
