import java.awt.*;

public class Food implements Elements{
    public static int row, col;

    public static void randomize(){
        row = (int)(Math.random() * 50);
        col = (int)(Math.random() * 50);
    }
    public static void draw(Graphics g) {
        g.setColor(RED_FOOD);
        g.fillRect(col * S, row * S, S, S);
    }
}
