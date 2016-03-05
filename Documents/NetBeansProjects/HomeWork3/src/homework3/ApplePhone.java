
package homework3;


public class ApplePhone extends Cellphone{
    
    String cards;
    String wifi;
    String apps;

        ApplePhone(String type, String model, String firm, int sizeMatrix, int dlina, int shirina, String color, int cost, String cards, String wifi, String apps) {
        super(type, model, firm, sizeMatrix, dlina, shirina, color, cost);
      
        this.cards=cards;
        this.wifi=wifi;
        this.apps=apps;
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
    }
    
}
