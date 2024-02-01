class student{
    int rollno;
    String name;
    static String collage="its";

    student(int r,String n){
        rollno=r;
        name=n;
    }
    void display(){
        System.out.println(rollno+""+name+""+collage);
    }
}
public class statickeyword {
    public static void main(String[] args) {
        student s1=new student(111, "pavan");
        student s2=new student(222, "ganesh");
        s1.display();
        s2.display();
        
    }
}
