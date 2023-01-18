import Products.*;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Product> catalog = List.of(
                new Cheese("Cheese Raclette Suisse Swiss", 800, "Switzerland"),
                new TV("TV Rubin", 8000),
                new Vine("Vine Lambrusco Bianco e Rosso", 3000, "Italy")
        );
        startShopping(catalog);
    }

    static void startShopping(List<Product> catalog) {
        String userInput;

        while (true) {
            showProductsInfo(catalog); //Правило DRY (Don’t Repeat Yourself): не повторяй свой код
            System.out.println("Введите id товара или введите \"С меня хватит\"");

            if ((userInput = scanner.nextLine()).equals("С меня хватит")) {
                break;
            } else {
                buy(catalog.get(Integer.parseInt(userInput) - 1));
            }
            System.out.println("Выбираем дальше!");
        }
    }

    static void buy(Product product) {
        System.out.println("Поздравляем, Вы купили " + product.getName());
        setRating(product);
    }

    static void setRating(Product product) {
        System.out.println("Оцените покупку от 1 до 5");
        product.addRating(Integer.parseInt(scanner.nextLine()));
        System.out.println("Вы великолепны!");
    }

    static void showProductsInfo(List<Product> products) {
        for (Product product :
                products) {
            product.showInfo(); //D- принцип инверсии зависимостей(Dependency Inversion Principle)
        }
    }
}
