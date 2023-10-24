import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    for(i in 0..5){
        println(i)

    }

    for(i in 1..30){
        println((1..99).random())
    }

    val lottoNumbers = generateLottoNumbers()
    println("Lotto : ${lottoNumbers.sorted().joinToString(", ")} ")

}

//1~45 겹치지않게 6개택하는 로또 추첨기
fun generateLottoNumbers(): List<Int> {
    val lottoNumbers = mutableListOf<Int>()
    val random = Random()

    while(lottoNumbers.size < 6){
        val randomNumber = random.nextInt(45) + 1
        if(!lottoNumbers.contains(randomNumber)){
            lottoNumbers.add(randomNumber)
        }
    }
    return lottoNumbers

}