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
public class FactoryProduct {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }
        return null;
    } 
    
}
