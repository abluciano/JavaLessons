
package homework3;

public class Cellphone {
    protected String type;   // тип аппарата: телефон, смартфон...
    protected String model;  // модель 
    protected String firm;   // фирма-изготовитель
    protected int sizeMatrix;      // диагональ экрана
    protected int dlina;
    protected int shirina;
    protected String color;  // цвет
    protected int cost;      // цена
    
    public Cellphone(String type, String model, String firm, int sizeMatrix, int dlina, int shirina, String color, int cost){
        
    this.type=type;   
    this.model=model;   
    this.firm=firm;   
    this.sizeMatrix=sizeMatrix;
    this.dlina=dlina;
    this.shirina=shirina;
    this.color=color;  
    this.cost=cost;
        
    }
    
    public void printPhone(){
      System.out.println("Ключевые параметры Вашего телефона: \n");
      System.out.println("Тип: "+type+"\n");
      System.out.println("Модель: "+model+"\n");
      System.out.println("Фирма: "+firm+"\n");
      System.out.println("Диагональ экрана: "+sizeMatrix+"\n");
      System.out.println("Длина: "+dlina+"\n");
      System.out.println("Ширина: "+shirina+"\n");
      System.out.println("Цвет: "+color+"\n");
      System.out.println("Цена: "+cost+" руб.\n");
    }
    
}
