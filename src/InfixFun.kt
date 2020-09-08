fun main() {


    var i = InfixFun()
    i.inf()

    val ui = UserInfixFun()
    ui createPyramid 4




}

//Infix-Function
class InfixFun{

    fun inf() {




        infix fun Int.times(str: String) = str.repeat(this)        //  Defines an infix extension function on Int.
        println(2 times "Bye ")                                    // Calls the infix function.

        val pair = "Ferrari" to "Katrina"                          // Creates a Pair by calling the infix function to from the standard library.
        println(pair)

        infix fun String.onto(other: String) = Pair(this, other)   //  implementation of to creatively called onto.
        val myPair = "McLaren" onto "Lucas"
        println(myPair)


    }

}


//User-Infix-Function


    class UserInfixFun() {

        infix fun createPyramid(rows: Int) {
            var k = 0
            for (i in 1..rows) {
                k = 0
                for (space in 1..rows-i) {
                    print("  ")
                }
                while (k != 2*i-1) {
                    print("* ")
                    ++k
                }
                println()
            }
        }
    }






