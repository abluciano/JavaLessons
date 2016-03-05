
package homework3;


public class Circle extends Figure {
    
    Circle(String name, int r){
     super(name, r);   
    }
    
     protected void res(){
      double S = Math.PI*Math.pow(r, 2);
     double L = 2*Math.PI*r;
     System.out.println("Для круга с указанным радиусом площадь: "+S+" а длина окружности "+L);
   }
    
}
