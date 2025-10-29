public class Mallard extends Duck {

    public Mallard() {
        quackBehavior = new Quack ();
        flyBehavior = new FlyWithWings();
    }

    public void display () {
        System.out.println("I'm a real Mallard Duck");
    }
}
