/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama        : Alvin Lukman Nulhakim
 * Nim         : 10117095
 * Kelas       : IF-3
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Human a = new Human();
        a.setNama("Alvin Lukman Nulhakim");
        a.walk(a.getNama());
        a.breath(a.getNama());
        a.eat(a.getNama());
    }
    
}
