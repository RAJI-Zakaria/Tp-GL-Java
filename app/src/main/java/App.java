/*
 * This Java source file was generated by the Gradle 'init' task.
 */
 
import demo.Money;

public class App {  
    public static void main(String[] args) {
        Money m1 = new Money(20,"EUR");
        Money m2 = new Money(10,"EUR");
        Money expected = new Money(30,"EUR");
        System.out.println(m1.add(m2));
    }
}
