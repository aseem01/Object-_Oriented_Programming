/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASHIM
 */
public class ThreadDemo extends Thread {

    private Thread t;
    private String threadName;

    ThreadDemo(String name) {
        threadName=name;
        System.out.println("Creating : "+threadName);
    }
    public void run()
    {
        System.out.println("Running : "+threadName);
        for(int i=4;i>0;i--){
            System.out.println("Thread : "+threadName+", "+i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("Thread : "+threadName+" exiting.");
        }
    }
    
    public void start(){
        System.out.println("Starting : "+threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}
