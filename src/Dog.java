/**
 * Created by stephenboynton on 6/29/17.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private int coat;

    //before
    //public Dog(String name, int brain, int body, int size, int weight) {
      //  super(name, brain, body, size, weight);
    //}

    //after.... You can define the parameters from teh super class already.

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, int coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew () {
        System.out.println("nom nom nom");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Walking like a dog!");
        move(2);
    }

    public void run() {
        System.out.println("Running, ruff ruff!");
        move(10);
    }
}
