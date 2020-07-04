package homeworkone;

public class Chocolate extends Sweetness {

    int percentageCocoa;

    public Chocolate(String name, int weight, int cost, int percentageCocoa){
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.percentageCocoa = percentageCocoa;
    }

    @Override
    void individualParameter() {
        System.out.println("Процент какао: " + this.percentageCocoa);
    }

}
