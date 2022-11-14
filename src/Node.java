import java.awt.*;

public class Node implements Elements{
    int row;
    int col;
    Node next;

    public Node(int row, int col){
        this.row = row;
        this.col = col;
        next = null;
    }

    public Node(int row, int col, Node next){
        this.row = row;
        this.col = col;
        this.next = next;
    }

    public void draw(Graphics g) {
        g.setColor(GREEN_SNAKE);
        g.fillRect(col * S, row * S, S, S);
        if (next != null){
            next.draw(g);
        }
    }
}
