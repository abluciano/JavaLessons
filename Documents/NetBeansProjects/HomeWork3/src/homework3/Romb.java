package homework3;

public class Romb extends Figure{
    
    int d1;
    int d2;
    
    Romb(String name, int st1, int st2, int st3, int st4, int d1, int d2){
        super(name, st1, st2, st3, st4);
        
                
       super.name="Ромб";
       super.st1 = st1;
       super.st2 = st1;
       super.st3 = st1;
       super.st4 = st1;
       this.d1 = d1;
       this.d2 = d2;
        
    }
    
    int P = super.perimetr(st1, st2, st3, st4);
    float S = (d1*d2)/2;
    
    public void res(){
         System.out.println("Периметр ромба: "+P+", а площадь "+S);
    }
    
}
