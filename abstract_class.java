abstract class parent{
    public parent(){
        System.out.println("Hello i am parent class");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child2 extends parent{
    @Override
    public void greet(){
        System.out.println("hello how are you");
    }
    @Override
    public void greet2(){
        System.out.println("hey i am fine ");
    }
}
abstract class child3 extends parent{
    public void bol(){
        System.out.println("mi kay bolu tuch bol");
    }
}

public class abstract_class {
    public static void main(String[] args) {
        child2 c= new child2();
        //parent p=new parent();   not acceptable
        //child3 c3= new child3();
        c.sayhello();
        c.greet();
        c.greet2();
    }
    
}
