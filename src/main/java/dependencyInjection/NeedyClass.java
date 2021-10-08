package dependencyInjection;

public class NeedyClass {
    private DependentClass need;

    public NeedyClass(DependentClass need) {
        this.need = need;
    }

}
