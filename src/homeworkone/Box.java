package homeworkone;

public interface Box {

    void addSweet(Sweetness Sweet);

    void deleteIndexSweet(int Index);

    void deleteLastSweet();

    int allWeightSweet();

    int allCostSweet();

    void allInformationSweet(); // вывести список и параметр каждой

    void reduceWeight(int maxWeightBox);

    void reduceCost(int maxCostWeight);
}
