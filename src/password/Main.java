/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

/**
 *
 * @author Usuario DAM 1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Password pass;
       pass = new Password(8);
       System.out.println(pass.generarPassword());
       System.out.println(pass.esFuerte());
    }
    
}
