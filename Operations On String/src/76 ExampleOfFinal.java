
class Car{
    String color;
    String Model;
    int MaxSpeed;
    final String EngineName = "2NmHP";
    Car(){
        this.color = "Black";
        this.Model = "V2025";
        this.MaxSpeed = 120;
    }

    public static void main(String[] args){
        Car car1 = new Car();
        System.out.println(car1.EngineName);
    }
}

class ExampleOfFinal {


}
