package chris.han

fun main() {
  val mail = Mail(listOf("")).apply {
    message("Hello")
    subject("Hello")
  }
  
  println(mail)
}

data class Mail(
  val to: List<String>,
  private var _message: String? = null,
  private var _subject: String? = null,
) {
  fun message(message: String) = apply { _message = message }
  fun subject(subject: String) = apply { _subject = subject }
}
