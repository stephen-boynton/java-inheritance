/**
 * Created by stephenboynton on 6/29/17.
 */
public class Main {

    public static void main (String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 57, 80);

        Dog yorkie = new Dog("Yorkie", 12, 10, 2, 4, 1, 18, 1);

        yorkie.eat();

        yorkie.walk();

        yorkie.run();
    }

}
