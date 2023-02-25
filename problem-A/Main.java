package File;

public class MyInt{
    public static void main(String[] args){
        MoovablePoint m1 = new MoovablePoint(5,4,11, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        MoovableCircle m = new MoovableCircle(5 ,4 , 10 , 15, 45);
        System.out.println(m);
    }
}
