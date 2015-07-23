

name := "ml-threader"

version := "1.0"

scalaVersion := "2.11.7"

tutSettings

tutTargetDirectory := file(".")

scalacOptions += "-feature"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.1.3"

initialCommands :=
  """
    |//import scalaz._
    |//import Scalaz._
    |
    |case class Pessoa(nome:String, idade:Int)
    |
    |case class Carro(marca:String)
    |
    |val pessoa = Pessoa("João", 20)
    |
    |val carro = Carro("Fiat")
    |
  """.stripMargin