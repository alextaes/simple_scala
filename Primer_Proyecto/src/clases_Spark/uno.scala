package clases_Spark

class uno {
  
  object ModelToBrand {

   import scala.io.StdIn.readLine;
  
   def main(args: Array[String]) {
    
      val miMapa = Map( 
          "1"->"Platano",
          "2"->"Naranja",
          "3"->"Platano",
          "3A"->"Pera",
          "4"->"Melon",
          "4A"->"Melocoton",
          "5"->"Platano", 
          "S1"->"Ronin", 
          "S2"->"Ninja",
          "S3"-> "Ronin",
          "F01L"->"Sorrento", 
          "F11L"->"Silvan",
          "F21L"->"Bilbao", 
          "F23L"->"Vazquez", 
          "F33LL"->"Ferran", 
          "F41L"->"Silvan")
          
        println("Introduzca argumento")  
       val input = scala.io.StdIn.readLine()    
                           
      if (input.length > 0) {
          println("has escrito: " + args(0))

          if (miMapa.contains(input)) {
             println("La marca es: " + miMapa(input) ) 
          } else { 
             println("Registro no encontrado")
          }
      } else {
          println("Modelos: ")
          miMapa.keys.foreach(println)
          println("\n"+"Marcas: " )
          miMapa.values.toSet.foreach(println)

     }
  }
}
  
  
  
}