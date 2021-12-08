package SingleInheritance2;
import java.util.Scanner;

abstract class Animal{
    public void sleep(int hours){
        System.out.println("Sleeps "+ hours + " hours a day");
    }
    public abstract void voice();
}
class Cat extends Animal{
        @Override
        public void voice(){
        System.out.println("Cat says: Meaw Meaw");
    }    
        @Override
        public void sleep(int h){
            System.out.print("Cat ");
            super.sleep(h);
    }
}
class Dog extends Animal{
    @Override
    public void voice(){
        System.out.println("Dog says: Woaf Woaf!!");
    }  
    @Override
    public void sleep(int h){
        System.out.print("Dog ");
        super.sleep(h);
    }
}
public class problem2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        Cat cat = new Cat();
        
        System.out.println("How long your cat sleeps:");
        int h = s.nextInt();
        cat.sleep(h);
        cat.voice(); 
        
        Dog dog = new Dog();
        
        dog.voice();
        
        
    }
}

