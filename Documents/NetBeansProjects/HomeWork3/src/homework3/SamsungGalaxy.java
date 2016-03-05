
package homework3;


public class SamsungGalaxy extends ApplePhone{
  
     boolean gems;
    
    SamsungGalaxy(String type, String model, String firm, int sizeMatrix, int dlina, int shirina, String color, int cost, String cards, String wifi, String apps, boolean gems){
        
        super(type, model, firm, sizeMatrix, dlina, shirina, color, cost, cards, wifi, apps);
        
        this.gems=gems;
        
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
      System.out.println("Карты памяти: "+cards+" руб.\n");
      System.out.println("Тип WiFi: "+wifi+" руб.\n");
      System.out.println("Установленные приложения: "+apps+"\n");
      
      if (gems==true){
          System.out.println("И со стразиками от Сваровски!!!");
      }
      else{
          System.out.println("Без стразиков");
      }
    }
   
}
