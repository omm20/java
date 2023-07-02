public class interfaces {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
        King k = new King();
        k.moves();
    } 
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("ups,down,diagonals,(in all 4 directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up and down");
    }
}
class King implements ChessPlayer{
    public void moves(){
         System.out.println("moves only one step in all 4 directions");
    }
}

