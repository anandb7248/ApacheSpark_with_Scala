// VALUES are immutable constants
val hello:String = "Hola";

// Variables are mutable
var helloThere: String = "Hello there!"

helloThere = hello + " There!"

val immutableHelloThere = hello + " There"
println(immutableHelloThere)

// Data Types

val numberOne: Int = 1
val truth: Boolean = true
val letterA: Char = 'a'
val pi: Double = 3.14159
val piSinglePrecision: Float = 3.14159265f
val bigNumber: Long = 123456789
val smallNumber: Byte = 127

println("Here is a mess: " + numberOne + truth + letterA)

println(f"Pi is about $piSinglePrecision%.3f")
println(f"Zero padding on the left: $numberOne%5d")
println(s"I can use the s prefix to use variables like $numberOne $truth $letterA")

println(s"The s prefix isn't limited to variables; I can include any expression. Like ${1 + 2}")

val theUltimateAnswer: String = "To life, the universe, and everything is 42."
val pattern = """.* ([\d]+).*""".r

val pattern(answerString) = theUltimateAnswer
val answer = answerString.toInt
println(answer)

// Boolean
val isGreater = 1 > 2
val isLesser = 1 < 2
val impossible = isGreater & isLesser
val impossible = isGreater && isLesser

val picard: String = "Picard"
val bestCaptain: String = "Picard"
val isBest: Boolean = picard == bestCaptain

