/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author jit
 */
public class Student {
    private static Student aStudent; 

    public Student() {
    }

    public static Student getaStudent() {
        return aStudent;
    }
    
    public void show(){
        System.out.println("Sengleton");
    }
}
