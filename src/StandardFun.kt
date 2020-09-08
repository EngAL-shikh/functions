

    fun main(){

      var s = StandardFun()

        s.Stand()
    }

    class StandardFun{

        fun Stand(){
            val firstPerson = Person("omar", 20, "Programmer")
            val secondPerson = Person("hithammak", 30, "teacher")

            val olderPerson = if (firstPerson.age >= secondPerson.age) firstPerson else secondPerson
            olderPerson.printPerson()


            //run function

            run {
                if (firstPerson.age >= secondPerson.age) firstPerson else secondPerson
            }.printPerson()


            //with function
            with(firstPerson) {
                age += 1
                "Age is now $age"
            }.println()


            //run function
            firstPerson.run {
                age += 1
                "Age is now $age"
            }.println()


            //let function
            firstPerson.let { modifiedPerson ->
                modifiedPerson.age += 1
                "Age is now ${modifiedPerson.age}"
            }.println()


            //apply function
            secondPerson.apply {
                age += 1
                job = "Hot-dog seller"
            }.printPerson()


            //also function
            secondPerson.also {
                it.age += 1
                it.job = "YouTuber"
            }.printPerson()


            //takif function
            val str = "Hello"
            val caps = str.takeIf { it.isNotEmpty() }?.toUpperCase()

            println(caps)
        }
    }



    data class Person(var name: String,
                      var age: Int,
                      var job: String) {
        fun printPerson() = println(this.toString())
    }

    fun String.println() = println(this)




