import com.sun.tools.javac.Main;

public class classloader {
    public static void main(String[] args){
        //getting class loader for main class
        ClassLoader classLoader=Main.class.getClassLoader();
        
        //loading a class using the class loader
        try{
            //load example class dynamically using the class loader
            class<?> exapleClass=classLoader.loadClass("ExampleClass");
            //create an instance of the loaded class using reflectoin
            Object instance=exampleClass.newinstance();
            //cast the instance to the exampleclass type
            ExampleClass exampleObject=(ExampleClass)instance;
            //call a method of a the instantiated class
            obj.printMessage();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | e){
            e.printStackTrace();
        }
    }
}
