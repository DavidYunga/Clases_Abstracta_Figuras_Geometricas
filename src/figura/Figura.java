/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author Usuario
 */
abstract class Figura {

   public abstract double area();
   public abstract double perimetro();
   
   public  double Area(Figura figuras){        
        return figuras.area();        
    }
    public  double Perimetro(Figura figuras){        
        return figuras.perimetro();        
    }
    
}
