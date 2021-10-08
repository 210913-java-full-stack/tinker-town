package serialization;

import java.io.Serializable;

public class SerializableClass implements Serializable {
    private int i;
    private String s;

    public SerializableClass(int i, String s) {
        this.i = i;
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
