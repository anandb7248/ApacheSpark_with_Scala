// Data Structures

// Tuples
// Immutable Lists
val captainStuff = ("Picard", "Enterprise-D", "NCC-1701-D")

println(captainStuff._1)
println(captainStuff._2)

val picardsShip = "Picard" -> "Enterprise-D"
println(picardsShip._2)

// Lists
val shipList = List("Enterprise", "Defiant", "Voyager")

println(shipList(1))

println(shipList.head)
println(shipList.tail)

for(ship <- shipList) {println(ship)}

// Map
val backwardsShip = shipList.map((ship: String) => {ship.reverse})

// Reduce
val numberList = List(1,2,3,4,5)
val sum = numberList.reduce( (x: Int, y: Int) => x + y)

// Filter
val iHateFives = numberList.filter((x: Int) => x != 5)

// Concatenate Lists
val moreNumbers = List(6,7,8)
val lotsOfNumbers = numberList ++ moreNumbers

val lotsOfDuplicates = numberList ++ numberList
val distinctValues = lotsOfDuplicates.distinct
val maxValue = numberList.max
val total = numberList.sum
val hasThree = iHateFives.contains(5)

// Maps/Dictionary
val shipMap = Map("Kirk" -> "Enterprise", "Picard" -> "Enterprise-D")
print(shipMap("Kirk"))