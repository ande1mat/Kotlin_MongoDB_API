class CalculateStuff {


    fun calculateValue(a: Int) : Int {
        //Class Instance Method where you have to declare an instance of the object when used
        var b: Int = 0
        b = a + 1
        return b
    }

    companion object {
        //In Kotlin there are no Static methods like Java, os you declare a Companion Object
        //You do not need to create a new instance of Calculate Object to use calculateValue method
        //a static method like CalculateStuff.calculateValue() and get the response.
        //What differentiates static from instance methods is that they have no object that owns them.
        //Instead, static methods are defined on the class level and can be used without creating instances
        fun calculateValue(a: Int) : Int {
            var b: Int = 0
            b = a + 1
            return b
        }
    }


}