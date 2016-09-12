/**
 * Created by Jade on 12-09-16.
 */
public class Bored {
    public enum Status{ Busee, Free}

    public Status[][] board;

    public Bored(){
        this.board = new Status[8][8];
        /*for (int i = 0; i < 2; i++){
            for (int j = 0; j < 8; j++){
                board[i][j] = Status.Busee;
                board[7-i][j] = Status.Busee;
            }
        }*/
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                board[i][j] = Status.Free;
            }
        }
    }


}
