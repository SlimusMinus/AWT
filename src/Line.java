public class Line {
    private int x, y, x1, y1;
    public Line(int x, int y, int x1, int y1) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }
    public void draw(java.awt.Graphics gr){
        gr.drawLine(x,y,x1,y1);
    }
}
