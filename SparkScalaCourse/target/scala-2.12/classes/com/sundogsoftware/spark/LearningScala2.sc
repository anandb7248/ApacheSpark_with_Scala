// Flow Control

// If/Else
if(1 < 3) println("Impossible") else println("The world makes sense")

if(1 > 3) {
  println("Impossible!")
  println("really?")
}else {
  println("The world makes sense.")
  println("still.")
}

// Matching
val number = 3
number match {
  case 1 => println("One")
  case 2 => println("Two")
  case 3 => println("Three")
  case _ => println("Something else")
}

// For Loops
for (x <- 1 to 4) {
  val squared = x * x
  println(squared)
}

// While Loops
var x = 10
while(x >= 0) {
  println(x)
  x -= 1
}

// Do While
x = 0
do {println(x); x+=1} while(x < 10)

// Expressions
{val x = 10; x+ 10}