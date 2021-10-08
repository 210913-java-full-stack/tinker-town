package dependencyInjection;

//This is our dependency, we will "inject" it
public class DependentClass {
    String message;
    public DependentClass(String message) {
        this.message = message;
    }
}
