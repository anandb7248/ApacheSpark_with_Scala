package com.sundogsoftware.spark

import org.apache.spark._
import org.apache.log4j._

/** Compute the average number of friends by age in a social network. */
object FriendsByAge {

  def parseLine(line: String) : (Int, Int) = {
    val fields = line.split(",")

    val age = fields(2).toInt
    val numFriends = fields(3).toInt

    (age, numFriends)
  }
  
  /** Our main function where the action happens */
  def main(args: Array[String]) {
   
    // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)

    // 1. Create a Spark Context using every core of the local machine, and call it FriendsByAge
    val sc = new SparkContext("local[*]", "FriendsByAge")

    // 2. Create a RDD
    val rows = sc.textFile("data/fakefriends-noheader.csv")
    // The rows in the text file have the following pattern: id, name, age, # of friends

    // id, name, age, # of friends -> (age, # of friends)
    val ageNumFriendsRows = rows.map(parseLine)

    // mapValues -> age, (#friends, 1)
    val friends = ageNumFriendsRows.mapValues(friends => (friends, 1))
    friends.foreach(println) // (65,(101,1)) ...

    // Reduce by key: the values that map to the same key will get merged
    // (65,(101,1)), (65,(202,1)) -> (65, (101 + 202, 1 + 1)) = (65, (303, 2))
    val totalsByAge = friends.reduceByKey((t1, t2) => (t1._1 + t2._1, t1._2 + t2._2))

    totalsByAge.foreach(println)

    //  (65, (303, 2)) -> (65, 303/2)
    val averageByAge = totalsByAge.mapValues(x => x._1 / x._2)

    // Collect - Gives back everything in the RDD as a single data structure in Scala
    val results = averageByAge.collect()

    results.sorted.foreach(println)
  }
}
  