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
public class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }
        
        if(color.equalsIgnoreCase("Black")){
            return new Black();
        }
        if(color.equalsIgnoreCase("White")){
            return new White();
        }
        if(color.equalsIgnoreCase("Red")){
            return new Red();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
            return null;      
    }
    
}
