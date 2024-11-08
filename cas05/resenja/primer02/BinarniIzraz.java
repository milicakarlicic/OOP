package primer02;

public abstract class BinarniIzraz extends Izraz {
    private Izraz levi;
    private Izraz desni;

    public BinarniIzraz(Izraz levi, Izraz desni) {
    	// Pravimo kopiju izraza umesto da prepisujemo reference
    	// Zasto ne mozemo da koristimo konstruktor kopije?
        this.levi = levi.klon();
        this.desni = desni.klon();
    }

    public Izraz getLevi() {
        return levi;
    }

    public Izraz getDesni() {
        return desni;
    }
}
