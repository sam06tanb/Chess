package chess;
import boardgame.Position;
import boardgame.piece;

public abstract class Chesspiece extends piece {

    private Color color;
    private int moveCount;

    public Chesspiece(boardgame.board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void increaseMoveCount() {
        moveCount++;
    }

    public void decreaseMoveCount() {
        moveCount--;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position) {
        Chesspiece p = (Chesspiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
