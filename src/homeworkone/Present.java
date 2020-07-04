package homeworkone;

public class Present implements Box {
    private Sweetness present [];

    public Present(int length){
    this.present = new Sweetness[length];
    }



    @Override
    public void addSweet(Sweetness sweet) {
        for(int i = 0; i < this.present.length; i++){
            if (this.present[i] == null){
                this.present[i] = sweet;
                System.out.println("Добавлена сладость: " + sweet.name);
                break;
            } else if (i == (this.present.length - 1)){
                System.out.println("Сладость не добавлена: " + sweet.name + ", нет места в подарке");
            }
        }
    }

    @Override
    public void deleteIndexSweet(int index) {
        if(this.present[index] != null){
            this.present[index] = null;
            System.out.println("Удалена сладость, индекс: " + index);
        } else {
            System.out.println("Удалять нечего, индекс: " + index);
        }

    }

    @Override
    public void deleteLastSweet() {
        for(int i = (this.present.length - 1); i > -1; i--){
            if (this.present[i] != null){
                System.out.println("Удаляем сладость: " + this.present[i].name);
                this.present[i] = null;
                break;
            } else if (i == 0){
                System.out.println("Нечего удалять, подарок пуст");
            }
        }
    }

    @Override
    public int allWeightSweet() {
        int allWeightSweet = 0;
        for(int i = 0; i < this.present.length; i++){
            if(this.present[i] != null){
                allWeightSweet = allWeightSweet + this.present[i].weight;
            }

        }
        return allWeightSweet;
    }

    @Override
    public int allCostSweet() {
        int allCostSweet = 0;
        for(int i = 0; i < this.present.length; i++){
            if(this.present[i] != null){
                allCostSweet = allCostSweet + this.present[i].cost;
            }
        }
        return allCostSweet;
    }

    @Override
    public void allInformationSweet() {
        for(int i = 0; i < this.present.length; i++){
            System.out.println("Название сладости: " + this.present[i].name);
            System.out.println("Стоимость сладости: " + this.present[i].cost);
            System.out.println("Вес сладости: " + this.present[i].weight);
            this.present[i].individualParameter();
        }
    }

    @Override
    public void reduceWeight() {
        while (this.allWeightSweet() > 500){
            int indexMin = this.present.length;
            for(int i = 0; i < this.present.length; i++){
                if(this.present[i] != null){
                    if(indexMin == this.present.length){
                        indexMin = i;
                    } else if (this.present[i].weight < this.present[indexMin].weight){
                        indexMin = i;
                    }
                }
            }
            if(indexMin == this.present.length) {
                System.out.println("Коробка пуста");
            } else {
                deleteIndexSweet(indexMin);
            }
        }
        System.out.println("Подарок не превышает вес: 700 грамм");
    }

    @Override
    public void reduceCost() {
        while (this.allCostSweet() > 700){
            int indexMin = this.present.length;
            for(int i = 0; i < this.present.length; i++){
                if(this.present[i] != null) {
                    if (indexMin == this.present.length) {
                        indexMin = i;
                    } else if (this.present[i].cost < this.present[indexMin].cost) {
                        indexMin = i;
                    }
                }
            }
            if(indexMin == this.present.length) {
                System.out.println("Коробка пуста");
            } else {
                deleteIndexSweet(indexMin);
            }
        }
        System.out.println("Стоимость подарка не превышает: 500 рублей");
    }
}
