/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi5Objek;

/**
 *
 * @author Dede Sunarwan
 */

public class DemoIfDuaObjek {
    public void checkBilangan(int bilangan) {
        if (bilangan < 0) {
            System.out.println(bilangan + " merupakan bilanagn NEGATIF");
        } else if (bilangan == 0) {
            System.out.println("Nilai yang dimasukkan adalah NOL");
        } else { // (bilangan > 0)
            System.out.println(bilangan + " merupakan bilangan POSITIF");
        }
    }
}
