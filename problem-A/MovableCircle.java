package File;


class MoovableCircle implements Moovable {
    private   int radius;
    private MoovablePoint center;

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
    public MoovableCircle(int x, int y,int xS,int yS, int radius){
        this.radius = radius;
        center = new MoovablePoint(x,y,xS,yS);
    }
    public String toString(){
        return center.toString() + ",radius = " + radius;
    }
}
