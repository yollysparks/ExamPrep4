/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca3.examprep4;

import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author felesiah
 */
public class BlockingQueue {
    
    public static void main(String[] args) throws InterruptedException {
        java.util.concurrent.BlockingQueue queue = new ArrayBlockingQueue(1024);
        
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        S2 s2 = new S2(queue);
       
         
         
        new Thread(producer).start();
        new Thread(consumer).start();    
        new Thread(s2).start();
        

        Thread.sleep(1000);
    }
}
