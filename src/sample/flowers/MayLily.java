package sample.flowers;
import sample.interfaces.Doable;

public class MayLily extends Flower implements Doable {
    public MayLily() {
        growthADay = 0.007;
        lifeSpan = 14;
        cost = 0;
        livedFor = 0;
        height = 0;
        name = "May-lily";
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
        if(livedFor > 7 && livedFor < 15){
            cost = 1.1;
        }
        return this;
    }

    @Override
    public void die() {
        livedFor = lifeSpan;

    }

    @Override
    public void bloom() {
    }

    @Override
    public void pepper() {

    }

    public String toString(){
        String bl = doesItBloom?"blooms":"doesnt bloom";
        return "Name: " + name + "\nCost: "+ cost+"\nHeight: "+height + "\n"+bl;
    }


}
