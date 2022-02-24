import java.util.Scanner;

public class Available_Cars extends Car
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        Car Ferrari = new Car("Ferrari", "Spyder");
        Car Porsche = new Car("Porsche", "718");
        
        System.out.println("Enter the Ferrari's engine size:");
        Ferrari.engine_size = sc.nextInt();
        
        System.out.println("Enter the Porsche's engine size:");
        Porsche.engine_size = sc.nextInt();
        
        System.out.println(Ferrari);
        System.out.println(Porsche);
    }
}