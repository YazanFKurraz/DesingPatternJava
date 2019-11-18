/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author jit
 */
public class Main {
    public static void main(String[] args) {
        
        AbstractFactory shapeFactory = FactoryProduct.getFactory("Shape");
        
        Shape shape1 = shapeFactory.getShape("Yaza");
        shape1.draw();
    }
    
}
