class item{
    public static int instantcount=0;
    public static int totalquantity=0;
    
    private int quantity;
    item(int quantity){
        this.quantity=quantity;
        instantcount++;
        totalquantity+=quantity;
    }
    public static void displaystats(){
        System.out.println("number of insatnce created "+instantcount);
        System.out.println("total quantity"+totalquantity);
    }
    public static void updatetotalquantity(int additionalqauntity){
        totalquantity+=additionalqauntity;
    }
    public void displayquantity(){
        System.out.println("quantity of this item "+quantity);
    }
}

public class itemstatic {
    public static void main(String[] args) {
        item i1=new item(5);
        item i2=new item(4);
        item i3=new item(3);

        i1.displayquantity();
        i2.displayquantity();
        i3.displayquantity();

        item.displaystats();
        item.updatetotalquantity(10);
        item.displaystats();
    }
}
