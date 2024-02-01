package chris.han.staticFactoryMethodPattern

// 다음과 같이 기본 생성자를 private으로 선언하면
// 정적 팰토리 메서드를 통해서만 생성된다.
class Server private constructor(
  port: Long,
) {
  init {
    println("Server started on port $port")
  }
  
  companion object {
    fun withPort(
      port: Long,
    ): Server {
      return Server(port)
    }
  }
}
