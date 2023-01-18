package Products;

public class Vine extends Product implements Breakable, Importable {
    //L-принцип замены Барбары Лисков(Liskov Substitution Principle)

    private String country;

    public Vine(String name, double price, String country) {
        super(name, price); //Правило DRY (Don’t Repeat Yourself): не повторяй свой код
        this.country = country;
    }

    @Override
    public String warnUser() {
        return "Осторожно! Хрупкое!";
    }

    @Override
    public String getCountry() {
        return country;
    }

    public void showInfo() {
        super.showInfo(); //Правило DRY (Don’t Repeat Yourself): не повторяй свой код
        System.out.println("Страна: " + country);
        System.out.println(warnUser());
    }
}
