package kloniranje;

public abstract class Zivotinja implements Cloneable {
    private String vrsta;

    public Zivotinja(String vrsta) {
        this.vrsta = vrsta;
    }

    public String getVrsta() {
        return vrsta;
    }

    public abstract void oglasavanje();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
