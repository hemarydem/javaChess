
public abstract class Piece {
    Position position;
    String name;
    public abstract Position move(Position newPosition); // abstract function
    Piece(Position startPos, String name) {
        this.position = startPos;
        this.name = name;
    }
    Piece(Integer coordNB, String coordLettre, String name) {
        this.position = new Position(coordLettre, coordNB);
        this.name = name;
    }
}

