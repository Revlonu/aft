package homeworkone;

public class Cake extends Sweetness {

    String tasteCake;

    public Cake(String name, int weight, int cost, String tasteCake){
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.tasteCake = tasteCake;
    }

    @Override
    void individualParameter() {
        System.out.println("Основной оттенок вкуса: " + this.tasteCake);
    }

}
