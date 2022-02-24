import java.util.Scanner;

public class Cat
{
    public String name;
    public int age;
    public String fur_colour;
    
    public Cat(int age){
        this.name = "Devil";
        this.age = age;
        this.fur_colour = "Black";
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Cat testCats = new Cat(5);
        testCats.name = "Steve";
        testCats.fur_colour = "Brown";
        System.out.println("testCat: " + testCats);
        
        Cat devilCat = new Cat(3);
        System.out.println("devilCat: " + devilCat);
        
        Cat blackCat = new Cat(8);
        System.out.println("Enter the cat's name");
        blackCat.name = sc.nextLine();
        System.out.println("blackCat: " + blackCat);
    }
    
    @Override
    public String toString(){
        return "Cat{" + "name='" + name + "\'" + ", fur colour='" + fur_colour + "\'" + ", age=" + age + "}";
    }
}
