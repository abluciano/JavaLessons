
package homework3;

public class Deer {
    String name;
    int age;
 Deer(String name, int age){
        this.name=name;
        this.age=age;
    }
    
    public void getName(){
        System.out.println("Я олень по имени "+name+"мне "+age+"г. от роду");
    }
}
