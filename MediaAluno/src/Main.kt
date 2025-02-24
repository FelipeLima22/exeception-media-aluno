fun main() {

    try {
        val total = GradeCurricular()
            .add(10.0)
            .add(-7.0)
            .add(5.0)
            .media()

        println(total)
    }catch (e: Exception){
        println("Erro: ${e.message} ")
        e.printStackTrace()
    }

}

class GradeCurricular (){
    private var sum : Double = 0.0
    private var numberOfGrades : Int = 0


    fun add(grade: Double): GradeCurricular {
//        if (grade !in 0.0..10.0){
//            throw IllegalArgumentException("grade invalida")
//        }

        require(grade in 0.0 .. 10.0){"grade $grade invalida"}

        sum += grade
        numberOfGrades++
        return this
    }

    fun media (): Double {
        return sum / numberOfGrades
    }

}

