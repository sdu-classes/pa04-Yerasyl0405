package File;

class Fish extends Animal implements Pet {
    String name;
    public Fish() {
        super(0);
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name +" does not play");
    }

    @Override
    public void walk() {
        super.walk();
    }
    void eat(){
        System.out.println("Fish eats the kurt");
    }

}
