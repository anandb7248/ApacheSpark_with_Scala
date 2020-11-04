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