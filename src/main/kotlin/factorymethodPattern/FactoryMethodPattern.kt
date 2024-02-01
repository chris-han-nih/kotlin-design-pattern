package chris.han.factorymethodPattern

interface ChessPiece {
  val file: Char
  val rank: Char
}

data class Pawn(
  override val file: Char,
  override val rank: Char
): ChessPiece

data class Rook(
  override val file: Char,
  override val rank: Char
): ChessPiece

data class Knight(
  override val file: Char,
  override val rank: Char
): ChessPiece

data class Bishop(
  override val file: Char,
  override val rank: Char
): ChessPiece

data class Queen(
  override val file: Char,
  override val rank: Char
): ChessPiece

data class King(
  override val file: Char,
  override val rank: Char
): ChessPiece

fun createChessPiece(
  notation: String,
): ChessPiece {
  val (type, file, rank) = notation.toCharArray()
  
  return when (type) {
    'P' -> Pawn(file, rank)
    'R' -> Rook(file, rank)
    'N' -> Knight(file, rank)
    'B' -> Bishop(file, rank)
    'Q' -> Queen(file, rank)
    'K' -> King(file, rank)
    else -> throw IllegalArgumentException("Invalid notation: $notation")
  }
}
