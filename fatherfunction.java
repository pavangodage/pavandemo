class Father {
    int balance=35678;
    static String st="patil";//static variable is use to allocate memory once
    

public static void main(String[]args){
    Father son=new Father();
    System.out.println(son.balance);
    System.out.println(son.st);
    System.out.println(st);//because of static variavle this will also give output

    Father daughter =new Father();
    System.out.println(daughter.st);//display same as before
    System.out.println();
    daughter.balance=2300;
    daughter.st="ganesh";//here st is modified and it will now default name
    System.out.println(daughter.balance);
    System.out.println(daughter.st);
    System.out.println(st);
    //System.out.println(balance);//these will throws eror because it is not static variable

    }

}