object variables_practice {
  def main(args: Array[String]): Unit = {
    println("Hello World")
    println(("Hello World").length)
    println(("Hello World").getClass)
    println((10).getClass) //Int
    println((3.14).getClass) //Float
    println((true).getClass) //Boolean
    val name: String = scala.io.StdIn.readLine("Enter your name: ")
    println(Math.min(19, 8))
    println(Math.max(3,45))
    println(List(1,2,3,4,5).sum)

    //Variables
    var first_name: String = "Asabeneh"
    val last_name: String = "Yetayeh"
    val country: String = "Finland"
    val city: String = "Helsinki"
    val age: Int = 250
    val is_married = true
    val skills: List[String] = List("HTML", "CSS", "JS", "React", "Python")
    val person_info = Map(
      "firstname" -> "Asabeneh",
      "lastname" -> "Yetayeh",
      "country" -> "Finland",
      "city" -> "Helsinki"
    )

    println("Hello, World!") //The text Hello, World ! is an argument
    println("Hello","World !")//it can take multiple arguments, four arguments have been passed
    println(("Hello, World !").length ) //it takes only one argument#Printing the values stored in the variables

    println("First name: " + first_name)
    println("First name length:" + first_name.length)
    println("Last_name:" + last_name)
    println("Last name length:" + last_name.length)
    println("Country: " + country)
    println("City:" + city)
    println("Age:"+ age)
    println("Married:", is_married)
    println("Skills:" +skills)
    println("Person information:" + person_info)


    first_name = scala.io.StdIn.readLine("What is your name: ")
    val age1  = scala.io.StdIn.readLine("How old are you?")
    println(first_name)
    println(age1)

    //CASTING

    //Int to Float
    val num_int : Int = 10            //10
    println("num_int " + num_int)
    val num_float =  num_int.toFloat  //10.0
    println("num_float " +num_float)

    //Double to Int
    val gravity : Double = 9.81
    println(gravity.toInt)

    // Int to str
    print(num_int.toString)

    //str to int
    print(age1.toInt)

  }

}
