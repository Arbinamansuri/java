import java.io.*;
import java.util.*;
 
public class program1 implements Runnablethread {
      // method to start Thread
    public void run()
    {
        System.out.println(
            "Thread is Running Successfully");
    }
 
    public static void main(String[] args)
    {
        program1 g1 = new program1();
        // initializing Thread Object
        Thread t1
            = new Thread(g1);
        t1.run();
    }
}