class mythread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<2) {
            System.out.println("my cooking thread is running");
            System.out.println("i am happy");
            i++;
        }
    }
}
class mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<2) {
            System.out.println("my chatting thread is running");
            System.out.println("i am also happy");
            i++;
        }
    }    
}

public class threading {
    public static void main(String[] args) {
        mythread1 t1=new mythread1();
        mythread2 t2=new mythread2();
        t1.start();
        t2.start();
    }
}
