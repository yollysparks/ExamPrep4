/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca3.examprep4;

/**
 *
 * @author felesiah
 */
public class Consumer implements Runnable {
    protected java.util.concurrent.BlockingQueue queue = null;

    public Consumer(java.util.concurrent.BlockingQueue queue) {
        this.queue = queue;
    }

@Override
    public void run() {
        
        System.out.println(queue.poll());//take the thread wich were blocked by put()
        System.out.println(queue.poll());//so whenever their is an available space in the queue
        System.out.println(queue.poll());//it take the ones which were blocked first.
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
