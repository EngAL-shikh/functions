fun main() {


var M =MemberFun()

    M.lambda()
    M.Inline()
    M.LocalFun()




}

class MemberFun(){
    private var a = ""

    fun lambda(){
        // returning from a lambda
        val calculateGrade = { grade : Int ->
            when(grade) {
                in 0..40 -> "Fail"
                !is Int -> "Just a grade"
                in 41..70 -> "Pass"
                in 71..100 -> "Distinction"
                else -> false
            }
        }
        println(calculateGrade(57)) // => Pass

    }

    fun Inline(){}
        inline fun inlined(block: () -> Unit) {
            println("before")
            block()
            println("after")
        }

    fun LocalFun() {
        a = "this is a local function"
        fun printtype() {
            println(a)

        }
        printtype()
    }






}
