import scala.collection.mutable.ArrayBuffer
import scala.io.Source

//how to read a text file with sorted lines in alphabetical order

object MyFirstTask extends App{

  val filename = "/home/mse/IdeaProjects/FirstProject/src/MyText.txt"

  //the first way

  var z = ArrayBuffer.empty[String]

  for (line <- Source.fromFile(filename).getLines()) {

    z += line

  }

  val a = z.toList.sorted
  a.foreach{ println }


  //the second way
  //Source.fromFile(filename).getLines().toList.sorted.foreach { line => println(line) }


}
