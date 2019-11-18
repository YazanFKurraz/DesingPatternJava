/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author jit
 */
public class MainObserver {
    public static void main(String[] args) {
        
        Source source = new Source();
        
        new SmallObserver(source);
        new LargeObserver(source);
        
        System.out.println("First state change the string");
        source.setData("Yazan Fadel Kurraz");
        System.out.println("Second state change the string");
        source.setData("I Love Word Design Pattern");
    }
    
}
