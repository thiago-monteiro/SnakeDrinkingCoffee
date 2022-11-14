import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main extends JFrame implements Elements{
    static JFrame frame;
    public static DrawWindow drawPanel;
    public static int gameMode = 1;

    public static void main(String[] args) {
        System.out.println("WELCOME TO SNAKE (Java Edition)");
        init();
        try{
            new Main().prepareGui();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void init(){
        System.out.println("The Snake is: " + snake);
        Food.randomize();
    }

    private void prepareGui() throws IOException {
        frame = new JFrame("**** Snake ****");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        drawPanel = new DrawWindow();

        new Input(drawPanel);

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setResizable(false);
        drawPanel.setFocusable(true);
        drawPanel.requestFocusInWindow();


        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);

        update();
    }

    public static void update() throws IOException{
        while (gameMode == 1) {
            try {
                Thread.sleep(150);
            } catch (Exception e) {
                e.printStackTrace();
            }
            frame.repaint();
            snake.update();
        }

        System.out.println("GAME OVER!!!");
    }
}
