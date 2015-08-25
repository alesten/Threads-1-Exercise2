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
public class Threads1Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Even even = new Even();
        
        EvenThreadSync t1 = new EvenThreadSync(even);
        EvenThreadSync t2 = new EvenThreadSync(even);
        
        t1.start();
        t2.start();
    }
}


/*
    Det er muligt at der ikke kun kommer et lige tal ud 
    da den ene thread godt kan lægge 1 til lige før den 
    printer det ud og derved bliver det udprintede ulige

    I mit tilfælge er de ikke sket selvom jeg har kørt 
    det mange gange, men det kan komme til at ske

    Når sync er lagt ind vil den aldrig komme til at 
    blive ulige
*/