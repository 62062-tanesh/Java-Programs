import java.security.Provider;

public class Car extends Vehicle{
    @Override
    public void service(){
        super.service();
        System.out.println("Get a Good clean because this is my Car.");
    }
}
