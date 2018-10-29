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
public abstract class LivingThing {
    public abstract void walk(String nama);
    public void breath(String nama) {
        System.out.println(nama + " bernafas");
    }
    public void eat(String nama) {
        System.out.println(nama + " makan");
    }
}