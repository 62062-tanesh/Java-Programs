public interface Flyable {
    public abstract void Fly();
}
abstract class Bird implements Flyable{

}
class Eagle extends Bird{
    public void Fly(){
        System.out.println("Eagle is Flying");
    }

}
class TestRun{
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.Fly();
    }
}
