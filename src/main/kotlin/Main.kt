
//https://app.pluralsight.com/course-player?clipId=65d45527-6cf3-4429-ad6c-2090c06a2520

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    //Call the min function
    println (min(50, 45))

}


//Can simply declare a function on its own, no class...
fun min(a: Int, b:Int) : Int {
    //name of the variables comes first then type
    //return type comes at end

    //you can declare a Value that never changes, supporting immutability
    val name:String = "Matt Anderson"

    println("My name is $name and I am $a years old")

    //or Kotlin will infer the Value type like this
    val name2 = "Matt Anderson"

    println("My name is $name2 and I am $b years old")

    //You can also declare variables that can change
    var password:String

    //also if is not just a statement, if is now an expression it returns something...
    return if (a<b) a else b
}

//You can also declare a Class with a built in constructor/property of name on one line
class Person(val name:String){

}

//You can also declare a Class with properties, but don't need getters/setters
class Animal {
    var name: String = ""
    var numberOfTypes: Int = 0
}
