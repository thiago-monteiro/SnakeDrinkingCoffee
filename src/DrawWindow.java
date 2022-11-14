import javax.swing.*;
import java.awt.*;

public class DrawWindow extends JPanel implements Elements{
    public void paintComponent (Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        snake.draw(g);

        g.drawImage(APPLE_IMG, Food.col * S, Food.row * S, S, S, null);

        for (int i = 0; i < H; i ++){
            g.drawImage(WALL_IMG, 0, i * S, S, S, null);
            g.drawImage(WALL_IMG, (W -1) * S, i * S, S, S, null);
        }

        for (int i = 0; i < W; i ++){
            g.drawImage(WALL_IMG, i * S, 0, S, S, null);
            g.drawImage(WALL_IMG, i * S, (H -  1) * S, S, S, null);
        }
    }
}
