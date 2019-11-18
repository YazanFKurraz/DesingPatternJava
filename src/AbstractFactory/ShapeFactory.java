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
public class ShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String shape) {
        if(shape == null){
            return null;
    }
    
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
         if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
          if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
          return null;
    }
        
    
      @Override
    Color getColor(String color) {
        return null;
    }
    
}
