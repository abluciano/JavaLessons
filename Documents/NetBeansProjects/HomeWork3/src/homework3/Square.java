
package homework3;

public class Square  extends Figure{
    
    Square(String name, int st1, int st2, int st3, int st4){
        super(name, st1, st2, st3, st4);
        
       super.name="Квадрат";
       super.st1 = st1;
       super.st2 = st1;
       super.st3 = st1;
       super.st4 = st1;
        
    }
    
    public void res(){
        int P = super.perimetr(st1, st2, st3, st4);
        int S = st1*st2;
        System.out.println("Периметр квадрата: "+P+", а площадь "+S);
    }
    
}
