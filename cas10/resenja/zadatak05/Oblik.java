package primer05;

import java.util.Comparator;

public abstract class Oblik {
    private final Tacka centar;

    public static Comparator<Oblik> komparator = (o1, o2) -> {
      if (o1 instanceof Pravougaonik && o2 instanceof Pravougaonik) {
          Pravougaonik p1 = (Pravougaonik) o1;
          Pravougaonik p2 = (Pravougaonik) o2;
          return p1.getA() == p2.getA() ? Double.compare(p1.getB(), p2.getB())
                  : Double.compare(p1.getA(), p2.getA());
      } else if (o1 instanceof Krug && o2 instanceof Krug) {
          Krug k1 = (Krug) o1;
          Krug k2 = (Krug) o2;
          return Double.compare(k2.getPoluprecnik(), k1.getPoluprecnik());
      } else if (o1 instanceof Krug && o2 instanceof Pravougaonik) {
          return -1;
      } else {
          return 1;
      }
    };

    public Oblik(Tacka centar) {
        this.centar = new Tacka(centar);
    }
}
