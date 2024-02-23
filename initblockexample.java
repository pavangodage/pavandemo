import java.util.Random;
public class initblockexample{
    private String name;
    private int score;

    {
        name="unkwon";
        try {
            Random random=new Random();
            score=random.nextInt(101);
            if (score <0 || score>100) {
                throw new IllegalArgumentException("Invalid score generate");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error:" +e.getMessage());
            score=0;
        }
    }
    public initblockexample (String name){
        this.name=name;
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Score:"+score);
    }
    public static void main(String[]args){
        initblockexample player1=new initblockexample("pavan");
        initblockexample player2=new initblockexample("ganesh");

        System.out.println("Printing Player1 detalis");
        player1.display();
        System.out.println(" Printing player 2 details ");
        player2.display();
    } 

}

