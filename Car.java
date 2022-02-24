public class Car
{
    public String make;
    public String model;
    public int engine_size;
    
    
    Car(){
        this.engine_size = 0;
    }
    Car(String make){
        this();
        this.make = make;
    }
    Car(String make, String model){
        this(make);
        this.model = model;
    }
    
    @Override
    public String toString(){
        return "Car{" + "make='" + make + "\'" + ", model='" + model + "\'" + ", engine size=" + engine_size + "}";
    }
}