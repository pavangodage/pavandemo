
class SGGS{
    static{
           System.out.println("Inside the sggs static block start");
    }
    static int x=786;
    static public void main(String []args){
           SGGS sggs1=new SGGS();
           System.out.println("inside the main");
           System.out.println(x);
    }
    static {
           System.out.println("inside the static block end ");
    }
}