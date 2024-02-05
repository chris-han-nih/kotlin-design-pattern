package chris.han

interface Property {
  val name: String
  val value: Any
}

interface ServerConfiguration {
  val properties: List<Property>
}

data class IntProperty(
  override val name: String,
  override val value: Int
) : Property

data class StringProperty(
  override val name: String,
  override val value: String
) : Property

data class ServerConfigurationImpl(
  override val properties: List<Property>
) : ServerConfiguration

fun property(
  prop: String,
): Property {
  val (name, value) = prop.split(":")
  return when (name) {
    "port" -> IntProperty(name, value.toInt())
    "environment" -> StringProperty(name, value.trim())
    else -> throw RuntimeException("Unknown property")
  }
}
