package File;

class Rabbit extends Animal implements Pet{
    String name;

    public Rabbit(String name){
        super(4);
        this.name = name;
    }
    public Rabbit(){
        super(4);
        this.name = null;
    }
    @Override
    void eat() {
        System.out.println(name + " eats meat");
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println(name+" plays with ball");
    }
}
