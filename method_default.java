interface mycamera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("good morning");
    }
    default void record4kvideo(){
        greet();
        System.out.println("Recoeding 4k video");
    }
}

interface mywifi{
    String[] getnerworks();
    void connecttonetwork(String network);
}
class mycellfone{
    void callnumber(int phonenumber){
        System.out.println("calling"+phonenumber);
    }
    void pickcall(){
        System.out.println("Connecting");
    }
}
class mysmartphone extends mycellfone implements mywifi,mycamera{
    public void takesnap(){
        System.out.println("taking snap");
    }
    public void recordvideo(){
        System.out.println("recording video");
    }
    /*public void record4kvideo(){
        System.out.println("high quality videos");
    }*/
    
    public String[] getnerworks() {
        System.out.println("getting the list of networks");
        String[] networklist={"pavan3g","ganehsh4g","rohit5g"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("connecting to network");
    }
}

public class method_default{
    public static void main(String[] args){
        mysmartphone ms=new mysmartphone();
        String[]ar=ms.getnerworks();
        ms.record4kvideo();
        //ms.greet(); -->throws an error

        for(String item: ar){
            System.out.println(item);
        }
    }
}
