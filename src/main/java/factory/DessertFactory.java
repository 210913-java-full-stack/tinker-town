package factory;

public class DessertFactory {
    public static Dessert getDessert(String dessertType) {
        switch(dessertType) {
            case "cake":
                return new Cake();
            case "cookie":
                return new Cookie();
            case "pie":
                return new Pie();
            default:
                throw new DessertNotFoundException(dessertType + " not found");
        }
    }
}
