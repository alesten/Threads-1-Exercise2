/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads.pkg1.exercise2;

/**
 *
 * @author AlexanderSteen
 */
public class EvenThread extends Thread{
    
    private Even even;

    public EvenThread(Even even) {
        this.even = even;
    }
    
    public void run(){
        System.out.println(even.next());
    }
}
