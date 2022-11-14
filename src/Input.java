import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Input implements KeyListener, MouseMotionListener, Elements {
    private DrawWindow dw;

    public Input (DrawWindow dw) {
        this.dw = dw;


        dw.addKeyListener(this);
        dw.addMouseMotionListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        switch (e.getKeyCode()){
            case KeyEvent.VK_RIGHT:
                snake.dir = 0;
                break;

            case KeyEvent.VK_UP:
                snake.dir = 1;
                break;

            case KeyEvent.VK_LEFT:
                snake.dir = 2;
                break;

            case KeyEvent.VK_DOWN:
                snake.dir = 3;
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
