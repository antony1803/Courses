package sample.flowers;
import sample.interfaces.Doable;

public class Aster extends Flower implements Doable {
    public Aster() {
        growthADay = 0.015;
        lifeSpan = 28;
        cost = 0;
        livedFor = 0;
        height = 0;
        name = "Aster";
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
            cost = 2.5;
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
