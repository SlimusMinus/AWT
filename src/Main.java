import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.*;
import java.util.LinkedList;

public class Main extends Frame {
    LinkedList<Line> link_line = new LinkedList<>();
    public class MyMouse extends MouseAdapter {
        private int x, y;
        @Override
        public void mousePressed(MouseEvent e) {
            x = e.getX();
            y = e.getY();
        }
        @Override
        public void mouseDragged(MouseEvent e) {
            Line ln = new Line(x,y, e.getX(),e.getY());
            ln.draw(getGraphics());
            link_line.add(ln);
        }

    }

    @Override
    public void paint(Graphics g) {
        for (var item : link_line)
            item.draw(g);
    }

    public static void main(String[] args) {

        Main frame = new Main();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
        MyMouse mm = frame.new MyMouse();

        frame.addMouseListener(mm);
        frame.addMouseMotionListener(mm);

        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}