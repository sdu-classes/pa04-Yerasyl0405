package File;

public class Main {
    public static void main(String[] args){
        Fish d = new Fish();
        Rabbit  c = new Rabbit("Fluffy");
        Animal a = new Fish();
        Animal e =new Spider();
        Rabbit p  = new Rabbit();
        d.setName("Sazan");
        d.walk();
        c.eat();
        c.play();
        c.walk();
        a.eat();
        a.walk();
        e.eat();
        e.walk();
        p.setName("Mulky");
        p.play();
    }
}
