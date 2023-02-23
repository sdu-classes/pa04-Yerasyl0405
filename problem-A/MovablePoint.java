package File;

class MoovablePoint implements Moovable {
    int x ;
    int y;
    int xS;
    int yS;
    public MoovablePoint(int x, int y,int xS,int yS){
        this.x = x;
        this.xS = xS;
        this.y = y;
        this.yS = yS;
    }

    @Override
    public void moveUp() {
        y-= yS;
    }

    @Override
    public void moveDown() {
        y += yS;
    }

    @Override
    public void moveLeft() {
        x -=xS;
    }

    @Override
    public void moveRight() {
        x += xS;
    }
    public String toString(){
        return "("+x+","+y+"),speed=("+xS +","+yS+")";
    }
}
