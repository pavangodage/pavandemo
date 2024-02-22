public class initblock22jan {
    static int x;
    {
        System.out.println("Inside the sggs init block");
        x=786;
        System.out.println(x);
    }
    initblock22jan(){
        System.out.println("inside the initblock constructor");
    }
    static public void main(String[]args){
        initblock22jan sggs=new initblock22jan();
        sggs=new initblock22jan();
        System.out.println("inside the main");
    }
    static {
        System.out.println("inside the initblock22jan static bock");
    }
}
