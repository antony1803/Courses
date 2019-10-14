package sample.flowers;

public abstract class Flower implements Comparable<Flower>{
     double cost;
    static double lifeSpan;
    double height;
    double growthADay;
    double livedFor;
    String name;
    boolean doesItBloom;
    public Flower grow(double time){
        return this;
    }
    void die(){};
    public void bloom(){};
    public void pepper(){};
    public String getName(){
        return name;
    }
    public double getCost(){
        return cost;
    }
    public double getLifeSpan(){
        return lifeSpan;
    }
    public double getHeight(){
        return height;
    }
    double getGrowthADay(){
        return growthADay;
    }
    public int compareTo(Flower temp){
        return name.compareTo(temp.getName());
    }
    public int compareByCost(Flower temp){
        return cost - temp.getCost() > 0 ? 1 : -1;
    }
    public int compareByHeight(Flower temp){
        return height - temp.getHeight() > 0 ? 1 : -1;
    }
    public int compareBySpan(Flower temp){
        return lifeSpan - temp.getLifeSpan() > 0 ? 1 : -1;
    }
    public boolean doesItBloom(){
        return doesItBloom;
    }
}
