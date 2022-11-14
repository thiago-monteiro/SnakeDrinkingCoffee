import java.awt.*;
import java.awt.image.BufferedImage;

public interface Elements {
    int WINDOW_WIDTH = 818;
    int WINDOW_HEIGHT = 826;

    int W = 50;
    int H = 49;

    int S = 16;

    Color GREEN_SNAKE  = new Color(48, 176, 16);
    Color RED_FOOD  = new Color(255, 0, 0);

    Snake snake = new Snake();

    BufferedImage APPLE_IMG = Resources.LoadImage("Apple");
    BufferedImage WALL_IMG = Resources.LoadImage("Wall");

}
