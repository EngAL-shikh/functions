fun main() {
    var user= UserDefinedFun()
    user.anonymousFun()
    user.user1("omar")
    user.user2()

}

class UserDefinedFun() {

    var funType = ""


    fun user1(type: String) {
        funType = "user define function with no return value"
        println(funType)
    }

    fun user2(): String {
        funType = "user define function with no return value"
        return funType
    }

    fun anonymousFun() {

        var s: () -> String = {

            funType= "anonymous function"
            funType
        }

        println("this is an  explicit type  anonymous function")
    }


}