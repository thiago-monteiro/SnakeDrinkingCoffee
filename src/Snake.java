import java.awt.*;

public class Snake {
    Node head;
    Node tail;

    int row, col, dir, length;

    boolean eating = false;

    public Snake(){
        this.row = 16;
        this.col = 16;
        this.dir = 0;
        length = 1;
        head = new Node(11, 11);
        tail = head;
    }

    public void draw(Graphics g) {
        head.draw(g);
    }

    void checkCol(){
        int r = head.row;
        int c = head.col;

        if (r == Food.row && c == Food.col){
            Food.randomize();

            eating = true;
            length++;
        }

        if (r == 1 || r == Elements.H - 2 || c == 1 ||  c == Elements.W - 2){
            Main.gameMode = 0;
        }

        Node runner = head.next;
        while (runner != null){
            int bodyRow = runner.row;
            int bodyCol = runner.col;

            if (bodyRow == r && bodyCol == c){
                Main.gameMode = 0;
            }

            runner = runner.next;
        }
    }

    void popTail(){

        Node runner = head;

        while (runner.next != null) {
            Node temp = runner;
            if (runner.next != null){
                runner = runner.next;
                if (runner.next == null) {
                    temp.next = null;
                    break;
                }
            }
        }
    }

    public void update(){
        int r = head.row;
        int c = head.col;

        switch (dir) {
            case 0:
                c++;
                break;

            case 1:
                r--;
                break;

            case 2:
                c--;
                break;

            case 3:
                r++;
                break;
        }

        Node head_new = new Node(r, c, head);

        Node tail = head;

        head = head_new;
        head.next = tail;

        if (!eating){
            popTail();
        }

        else{
            eating = false;
        }
        checkCol();
    }

    Node getTail() {
        Node runner = head;
        while (runner.next != null){
            if (runner.next.next == null) {
                System.out.println("2 away from end");
                return runner;
            }
            runner = runner.next;
        }
        return runner;
    }
}
