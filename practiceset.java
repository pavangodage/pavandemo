abstract class Pen{
    abstract void write();
    abstract void refill();
}
class Fountainpen extends Pen{
    void write(){
        System.out.println("writing");
    }
    void refill(){
        System.out.println("refill");
    }
    void changenib(){
        System.out.println("changing the nib");
    }
}
class monkey{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("biting");
    }
}
interface basicanimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicanimal{
    void speak(){
        System.out.println("hello sir ");
    }
    @Override
    public void eat(){
        System.out.println("eating");
    }
    @Override
    public void sleep(){
        System.out.println("I am sleeping");
    }
}
public class practiceset {
    public static void main(String[] args) {
        Fountainpen pen=new Fountainpen();
        pen.changenib();

        human pavan=new human();
        pavan.sleep();

        monkey m1=new monkey();
        m1.jump();
        m1.bite();

        basicanimal ganu=new human();
        ganu.eat();
        ganu.sleep();
        
    }
}
