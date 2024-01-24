interface bycicle{
    int a=5;
    void applybreak(int decrement);
    void speedup(int increment);
}
interface hornbycicle{
    void blowhorn3kg();
    void blowhornmhn();
}
class avoncycle implements bycicle,hornbycicle{

    public void applybreak(int decrement){
        System.out.println("Appyling break");
    }
    public void  speedup(int increment){
        System.out.println("Increasing speed");
    }
    public void blowhorn3kg(){
        System.out.println("pee pee pee");
    }
    public void blowhornmhn(){
        System.out.println("pop pop pop");
    }
}

public class interface{

public static void main(String [] args ){
    avoncycle cycle1= new avoncycle();
    cycle1.applybreak(1);
    System.out.println(cycle1.a);
    cycle1.blowhorn3kg();
    cycle1.blowhornmhn();
    }

}

