import scala.math
object variables_excercise {
  def main(args: Array[String]): Unit = {
    //------------------ LEVEL 1 ------------------

    //1 The current file
    //2 Day 2: 30 Days of Scala programming#
    //3 Declare a first name variable and assign a value to it
    var first_name : String = "Rilwan"
    //4 Declare a last name variable and assign a value to it
    var last_name: String = "Abimbola"
    //5 Declare a full name variable and assign a value to it
    val full_name : String = "Rilwan Abimbola"
    //6 Declare a country variable and assign a value to it
    var country : String = "Nigeria"
    //7 Declare a city variable and assign a value to it
    val city: String = "Lagos"
    //8 Declare an age variable and assign a value to it
    var age: Int = 32
    //9 Declare a year variable and assign a value to it
    val year: Int = 2020
    //10 Declare a variable is_married and assign a value to it
    val is_married: Boolean = true
    //11 Declare a variable is_true and assign a value to it
    val is_true: Boolean = false
    //12 Declare a variable is_light_on and assign a value to it
    val is_light_on: Boolean = true
    //12 Declare multiple variable on one line
    val a: Int = 4; val b: String = "James"; val c: Double = 4.6;

    //---------------------- LEVEL 2 ----------------------------

    //1 Check the data type of all your variables using type() built-in function
    // datatypes has been declared with variables but the .getClass() can be used to check
    println(first_name.getClass)
    println(is_married.getClass)
    println(age.getClass)
    //2 Using the len() built -in function, find the length of your first name
    println(first_name.length)
    //3 Compare the length of your first name and your last name
    println(Math.min((first_name.length), last_name.length))
    println(Math.max((first_name.length), last_name.length))
    //4 Declare 5 as num_one and 4 as num_two
    val num_one: Int = 5
    val num_two: Int = 4
      //4i Add num_one and num_two and assign the value to a variable total
    val total = num_one + num_two
      //4ii Subtract num_two from num_one and assign the value to a variable diff
    val diff = num_one - num_two
      //4iii Multiply num_two and num_one and assign the value to a variable product
    val product = num_one * num_two
      //4iv Divide num_one by num_two and assign the value to a variable division
    val division = num_one / num_two
      //4v Use modulus division to find num_two divided by num_one and assign the value to a variable remainder
    val remainder = num_two % num_one
      //4vi Calculate num_one to the power of num_two and assign the value to a variable exp
    val exp = math.pow(num_one, num_two)
      //4vii Find floor division of num_one by num_two and assign the value to a variable floor_division
    val floor_division = (num_one / num_two).floor
    //5 The radius of a circle is 30 meters.
    var rad: Int = 30
    //5i Calculate the area of a circle and assign the value to a variable name of area_of_circle
    val pi = 3.142
    var area_of_circle = pi * rad * rad
    //5ii Calculate the circumference of a circle and assign the value to a variable name of circum_of_circle
    var circum_of_circle = 2 * pi * rad
    //5iii Take radius as user input and calculate the area.
    rad = (scala.io.StdIn.readLine("Enter the radius of the circle")).toInt
    area_of_circle = pi * rad * rad
    //6 Use the built -in input function to get first name , last name  , country and age from a user and store the value to their corresponding variable names
    first_name = scala.io.StdIn.readLine("Enter your first name:")
    last_name = scala.io.StdIn.readLine("Enter your last name:")
    country = scala.io.StdIn.readLine("Enter your country:")
    age = (scala.io.StdIn.readLine("Enter your age:").toInt)
    //7 Run help('keywords') in Python shell or in your file to check for the Python reserved words or keywords
    //no idea



  }
}
