/**
 * Created by stephenboynton on 6/29/17.
 */
public class Fish extends Animal {

    private int gills;
    private int fins;
    private int eyes;

    public Fish(String name, int size, int weight, int gills, int fins, int eyes) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    public void moveBody (){

    }

    public void controlBackFin () {

    }

    public void swim (int speed){
        moveBody();
        controlBackFin();
    }

    public void rest () {

    }
}
