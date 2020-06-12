package spica.x.hocon

/**
 * Test of {"repo": "subutai", "module": "hocon"}
 */
private object TestHoconMain extends App {
  val url: String = subutai.hocon.ReadConfigurationFile.url
  println("url = " + url)
}

private object ReadConfigurationFileMain extends App {
  import com.typesafe.config.{ Config, ConfigFactory }
  val config: Config = ConfigFactory.load("lightbend.conf")
  val jdbc: Config   = config.getConfig("jdbc")
  println("jdbc = " + jdbc)

  println(jdbc.entrySet())
}

private object PrintClassLoaderMain extends App {
  import subutai.hocon.classloader.PrintClassLoader._

  println("\n")
  println(getClass)
  printClassLoader(getClass.getClassLoader).foreach(println)

  println("\n")
  printThisClassLoader.foreach(println)

  println("\n")
  printSystemClassLoader.foreach(println)
}

private object ReadResourcesFromJarMain extends App {
  val stream: java.io.InputStream = getClass.getResourceAsStream("/spec/spec.xml")
  val lines  = scala.io.Source.fromInputStream(stream).getLines
  println(lines.mkString("\n"))
}