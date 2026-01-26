package zadatak02;

public abstract class UnarniIzraz extends Izraz {
    private Izraz operand;

    public UnarniIzraz(Izraz operand) {
        this.operand = operand.klon();
    }

    public Izraz getOperand() {
        return operand;
    }
}
