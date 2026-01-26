package zadatak02;

public class UnarniMinus extends UnarniIzraz {
    public UnarniMinus(Izraz operand) {
        super(operand);
    }

    @Override
    public double izracunaj() {
        return - getOperand().izracunaj();
    }

    @Override
    public Izraz klon() {
        return new UnarniMinus(getOperand());
    }

    @Override
    public String toString() {
        return "-" + "(" + getOperand() + ")";
    }
}
