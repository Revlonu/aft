package homeworkone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создаём объекты!");
        Present presentOne = new Present(3);
        Sweetness raffaello = new Lollipops("Раффаэлло", 150, 265, 20);
        Sweetness dove = new Chocolate("Даф", 90, 79, 26);
        Sweetness honeyCake = new Cake("Медовик", 500, 469, "Мёд");

        System.out.println("Добавляем сладости в пакет!");
        presentOne.addSweet(raffaello);
        presentOne.addSweet(dove);
        presentOne.addSweet(honeyCake);
        presentOne.addSweet(honeyCake);
        System.out.println("");

        System.out.println("Выводим данные!");
        System.out.println("Общий вес подарка: " + presentOne.allWeightSweet());
        System.out.println("Общая стоимость подарка: " + presentOne.allCostSweet());
        presentOne.allInformationSweet();
        System.out.println("");

        System.out.println("Работаем с удалением!");
        presentOne.deleteIndexSweet(1);
        presentOne.deleteIndexSweet(1);
        presentOne.deleteLastSweet();
        presentOne.deleteLastSweet();
        presentOne.deleteLastSweet();
        System.out.println("");

        System.out.println("Добавляем подарки и исключаем с наименьшим весом, пока подарок не будет превышать норму!");
        presentOne.addSweet(honeyCake);
        presentOne.addSweet(dove);
        presentOne.addSweet(honeyCake);

        presentOne.reduceWeight(500);
        System.out.println("");

        System.out.println("Добавляем подарки и исключаем с наименьшой стоимостью, пока подарок не будет превышать норму!");
        presentOne.addSweet(dove);
        presentOne.addSweet(raffaello);

        presentOne.reduceCost(700);


    }
}
