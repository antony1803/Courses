package sample.flowers;
import sample.interfaces.Doable;

public class Rose extends Flower implements Doable {
    public Rose() {
        growthADay = 0.012;
        lifeSpan = 35;
        cost = 0;
        livedFor = 0;
        height = 0;
        name = "Rose";
        doesItBloom = false;
    }

    @Override
    public Flower grow(double time) {
        if (livedFor + time < lifeSpan) {
            height += time * growthADay;
            livedFor += time;
        } else {
            height = growthADay * lifeSpan;
            die();
        }
        return this;
    }

    @Override
    public void die() {
        livedFor = lifeSpan;

    }

    @Override
    public void bloom() {
        if(lifeSpan > livedFor) {
            doesItBloom = true;
            cost = 5.5;
        }
    }

    @Override
    public void pepper() {
        doesItBloom = false;
        cost = 0;
    }

    public String toString(){
        String bl = doesItBloom?"blooms":"doesnt bloom";
        return "Name: " + name + "\nCost: "+ cost+"\nHeight: "+height + "\n"+bl;
    }
}
