import java.util.ArrayList;

/**
 * Created by Jade on 12-09-16.
 */
public interface Peace {
    public enum Color{ Normal, Canadian}

    public void move();
    public ArrayList<Coordinate> calcul8Position();
    public void dye();



}
