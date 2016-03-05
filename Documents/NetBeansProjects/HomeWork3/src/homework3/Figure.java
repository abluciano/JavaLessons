
package homework3;


public class Figure {
    
    String name;
    protected int st1;
    protected int st2;
    protected int st3;
    protected int st4;
    protected int r;
    
   Figure(String name, int st1, int st2, int st3, int st4){
    this.name=name;
    this.st1=st1;
    this.st2=st2;
    this.st3=st3;
    this.st4=st4;
   }
   
   Figure(String name, int r){
       
    this.name=name;
    this.r=r;
       
   }
    
   protected int perimetr(int x1, int x2, int x3, int x4){
      return x1+x2+x3+x4;
   }
   
   
   protected void res(){
       System.out.println("Тут будут выводится вычисления по фигуре");
   }
   
}
