package Products;

public class TV extends Product implements Breakable {
    //L-принцип замены Барбары Лисков(Liskov Substitution Principle)

    public TV(String name, double price) {
        super(name, price); //Правило DRY (Don’t Repeat Yourself): не повторяй свой код
    }

    @Override
    public String warnUser() {
        return "Осторожно! Не кантовать!";
    }

    @Override
    public void showInfo() {
        super.showInfo(); //Правило DRY (Don’t Repeat Yourself): не повторяй свой код
        System.out.println(warnUser());
    }
}
