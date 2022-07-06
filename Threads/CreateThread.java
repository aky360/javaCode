import java.lang.Thread;

//A thread in Java can be created in the following two ways:
//1. Extending java.lang.Thread class
//2. Implementing Runnable interface


//Extending java.lang.Thread class
public class CreateThread extends Thread{
    public void run(){
        System.out.println("the thread is running ");
    }
    public static void main(String[] args) {
        CreateThread obj = new CreateThread();
        obj.run();
    }
}


//Implementing Runnable interface
public class CreateThread implements Runnable{
    public void run(){
        System.out.println("the thread is running ");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new CreateThread());
        t.start();
        //System.out.println("Hello, World!"); 
    }
}



//=====================================================================================================================
import java.lang.Thread;
public class CreateThread extends Thread{
    public void run(){
        System.out.println("the thread is running ");
    }
    public static void main(String[] args) {
        Thread obj = new Thread(new CreateThread());
        CreateThread obj1 = new CreateThread();
        obj.run();
        obj.start();
        System.out.println();
        obj1.run();
        obj1.start();
        System.out.println(obj.getName());
        System.out.println(obj1.getName());
    }
}

//
