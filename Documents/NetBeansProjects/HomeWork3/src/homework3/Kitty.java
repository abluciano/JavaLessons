
package homework3;


public class Kitty {
    String name;
    int age;
    
    Kitty(String name, int age){
        this.name=name;
        this.age=age;
    }
    
    public void getName(){
        System.out.println("Я кот по имени "+name+"мне "+age+"г. от роду");
    }
    
}
