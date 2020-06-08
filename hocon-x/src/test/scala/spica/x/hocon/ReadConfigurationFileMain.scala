package spica.x.hocon

private object TestHoconMain extends App {
  import subutai.hocon.ReadConfigurationFile.config
  println("driver = " + config.getString("jdbc.driver"))
  println("jdbc = " + config.getConfig("jdbc"))
  println("config = " + config.entrySet())
}

private object ReadConfigurationFileMain extends App {
  import com.typesafe.config.{ Config, ConfigFactory }
  val config: Config = ConfigFactory.load("lightbend.conf")
  println("url = " + config.getString("jdbc.url"))
}
