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
public class Producer implements Runnable {
    protected java.util.concurrent.BlockingQueue queue = null;

    public Producer(java.util.concurrent.BlockingQueue s1) {
        this.queue = s1;
    }

    @Override
    public void run() {
     try {
            queue.put("4");
            Thread.sleep(1000);
            queue.put("5");
            Thread.sleep(1000);
            queue.put("8");
            Thread.sleep(1000);
            queue.put("12");
            Thread.sleep(1000);
            queue.put("21");
            Thread.sleep(1000);
            queue.put("22");
            Thread.sleep(1000);
            queue.put("34");
            Thread.sleep(1000);
            queue.put("35");
            Thread.sleep(1000);
            queue.put("36");
            Thread.sleep(1000);
            queue.put("37");
            Thread.sleep(1000);
            queue.put("42");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
