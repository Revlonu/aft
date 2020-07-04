package homeworkone;

public class Lollipops extends Sweetness {

    int amountPackage;

    public Lollipops(String name, int weight, int cost, int amountPackage){
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.amountPackage = amountPackage;
    }


    @Override
    void individualParameter() {
        System.out.println("Кол-во в упаковке: " + this.amountPackage);
    }
}
