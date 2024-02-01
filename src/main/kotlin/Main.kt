package chris.han

import chris.han.factorymethodPattern.createChessPiece

fun main() {
  val chessPieces = listOf(
    createChessPiece("Pd2"),
    createChessPiece("Pd7"),
    createChessPiece("Rd1"),
    createChessPiece("Rd8"),
    createChessPiece("Nd2"),
    createChessPiece("Nd7"),
    createChessPiece("Bc1"),
    createChessPiece("Bf8"),
    createChessPiece("Qd1"),
    createChessPiece("Qd8"),
    createChessPiece("Kd1"),
    createChessPiece("Kd8"),
  )

  chessPieces.forEach(::println)
}
