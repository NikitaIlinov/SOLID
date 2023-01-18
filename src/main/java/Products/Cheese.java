package Products;

public class Cheese extends Product implements Importable {
    //L-принцип замены Барбары Лисков(Liskov Substitution Principle)

    private String country;

    public Cheese(String name, double price, String country) {
        super(name, price); //Правило DRY (Don’t Repeat Yourself): не повторяй свой код
        this.country = country;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void showInfo() {
        super.showInfo(); //Правило DRY (Don’t Repeat Yourself): не повторяй свой код
        System.out.println("Страна: " + country);
    }
}
