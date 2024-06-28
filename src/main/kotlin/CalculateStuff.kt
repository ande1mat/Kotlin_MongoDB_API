class CalculateStuff (val stuffname: String, var stuffdo: Int) {
    //All classes are Public and Final by default
    //above stuffname is the property and Constructor (instance of the Class) of the Class CalculateStuff
    //stuffname is immutable and it cant change as its a 'value or val'
    //stuffdo is a 'variable var' so it is mutable and can change

    fun calculateValue(a: Int) : Int {
        //Class Instance Method where you have to declare an instance of the object when used
        var b: Int = 0
        b = a + 1


        //Use the data class below to do something
        val matt = User("Matt", 1)
        print(matt)
        val (name, id) = matt
        println("Their name is $name and their id is $id")


        //We can also copy a Data object to another value
        val otheruser = matt.copy(id = 2)
        //name is still matt, but the id is now 2
        println("Their name is $name and their id is $id")
        return b
    }

    companion object {
        //In Kotlin there are no Static methods like Java, so you declare a Companion Object
        //You do not need to create a new instance of Calculate Object to use calculateValue method
        //a static method like CalculateStuff.calculateValue() and get the response.
        //What differentiates static from instance methods is that they have no object that owns them.
        //Instead, static methods are defined on the class level and can be used without creating instances

        //Singleton object would be like for a DB Connection
        //Explanation of Object declarations in Kotlin  https://kotlinlang.org/docs/object-declarations.html

        fun calculateValue(a: Int) : Int {
            var b: Int = 0
            b = a + 1
            return b
        }
    }


    //In Kotlin we can pass a function as a parameter to another function
    //this is the function being passed "{ a: Int, b:Int -> a*b}" along with two Int variables
    //nice explanation here https://medium.com/javarevisited/function-as-parameter-in-kotlin-easy-explanation-c77e6e2c40f0

    //mathFunc is the function that the calling method must work with.
    //Whatever function is passed will have to take two Int inputs and will have to return Int.  (Int, Int) -> Int)
    private fun mathFunction(a: Int, b:Int, mathFunc : (Int, Int) -> Int)    {
        print ("Value of calculation: ${mathFunc(a,b)}")
    }

     public fun callerFunction () {
        val multiplication : (Int, Int) ->Int = { a: Int, b:Int -> a*b}
         //here we are passing in multiplication as the function to mathFunc
        mathFunction (3, 4, multiplication)
    }





    data class User(val name: String, val id: Int)
    //You can create a Data class to hold Data, and Kotlin will automatically
    //create tostring, getters/setters, etc. for you with no code.


}