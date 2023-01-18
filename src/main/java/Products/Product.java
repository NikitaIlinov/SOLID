package Products;

public abstract class Product implements Rateable {
    //S - принцип единственной ответственности(Single Responsibility Principle)
    private int rating;
    private int id;
    private String name;
    private double price;

    private static int lastId = 1; //O - принцип открытости/закрытости(Open Closed Principle

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.id = lastId++; //Правило Magic: не используй числа напрямую в коде
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void showInfo() {
        System.out.println("-----------------\n"
                + "  [ " + id + " ]\n"
                + name + "\n"
                + price + " руб.\n"
                + "Оценка: " + rating);
    }

    @Override
    public void addRating(int rating) { //Правило DRY (Don’t Repeat Yourself): не повторяй свой код

        if (this.rating == 0) {
            this.rating = rating;
        }
        this.rating = (this.rating + rating) / 2;
    }

    @Override
    public int getRating() {
        return this.rating;
    }
}
