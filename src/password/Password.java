/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

/**
 *
 * @author Usuario DAM 1
 * 
 */
public class Password {

    private Integer longitud = 8;
    private String pass = null;

    public Password() {
    }

    public Password(Integer longitud) {
        this.longitud = longitud;
        
    }
    

    public Password(Integer longitud, String pass) {
        this.longitud = longitud;
        this.pass = pass;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    boolean esFuerte(){
    int numMayusculas = 0;
    int numMinusculas = 0;
    int numNumeros = 0;
    boolean esFuerte = false;
        for (int i = 0; i < pass.length(); i++) {
         if(Character.isLowerCase(pass.charAt(i))) numMinusculas++;
         if(Character.isUpperCase(pass.charAt(i))) numMayusculas++;
         if(Character.isDigit(pass.charAt(i))) numNumeros++;
         
         if(numMayusculas >= 2 && numMinusculas >=1 && numNumeros >= 5){
         esFuerte = true;
         }
         
        }
        return esFuerte;
    
    
    }
    public String generarPassword(){
    String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String minusculas = mayusculas.toLowerCase();
    String numeros = "0123456789";
    
    Integer numNumeros = (int)(Math.random()*(this.longitud-7))+5;
    Integer numMayusculas = (int)(Math.random())*(this.longitud-numNumeros-2)+2;
    Integer numMinusculas = this.longitud - numNumeros - numMayusculas;
        this.pass = "";
        for (int i = 0; i < numMayusculas; i++) {
            this.pass = this.pass + mayusculas.charAt((int)(Math.random()*mayusculas.length()));
        }
        for (int i = 0; i < numMinusculas; i++) {
            this.pass = this.pass + minusculas.charAt((int)(Math.random()*minusculas.length()));
        }
        for (int i = 0; i < numNumeros; i++) {
            this.pass = this.pass + numeros.charAt((int)(Math.random()*numeros.length()));
        }
        this.pass = shuffle(this.pass);
        return this.pass;
    }  
    
    
    
    public static String shuffle(String text) {
    char[] characters = text.toCharArray();
    for (int i = 0; i < characters.length; i++) {
        int randomIndex = (int)(Math.random() * characters.length);
        char temp = characters[i];
        characters[i] = characters[randomIndex];
        characters[randomIndex] = temp;
    }
    return new String(characters);
}
    
    
    @Override
    public String toString() {
        return "Password = "+pass;
    }
    
}
