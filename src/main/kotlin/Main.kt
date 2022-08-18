fun main() {
    val likes = 1111
    val firstNaming = "человеку"
    val secondNaming = "людям"
    val result = if ((likes % 10 == 1) && (likes % 100 !== 11))  firstNaming  else secondNaming
    println("Понравилось $likes $result")
}