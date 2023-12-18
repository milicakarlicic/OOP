package primer04;

// ime -> brojevna vr
public enum Opcija {
    ADD,        // 0
    REMOVE,     // 1
    HEAD,       // 2
    BACK,       // 3
    SIZE,       // 4
    SHOW,       // 5
    EXIT;       // 6

    public static Opcija intUOpciju(int x) {
        switch (x) {
            case 0: return ADD;
            case 1: return REMOVE;
            case 2: return HEAD;
            case 3: return BACK;
            case 4: return SIZE;
            case 5: return SHOW;
            case 6:
            default: return EXIT;
        }
    }
}

/*
ako hocemo imenima da dodijelimo neke brojeve koji nisu uzastopni i/ili ne krecu od 0:

public enum Opcija {
    ADD(0),
    REMOVE(2),
    HEAD(4),
    BACK(6),
    SIZE(8),
    SHOW(10),
    EXIT(12);

    Opcija(int i) {
    }

    public static Opcija intUOpciju(int x) {
        switch (x) {
            case 0: return ADD;
            case 2: return REMOVE;
            case 4: return HEAD;
            case 6: return BACK;
            case 8: return SIZE;
            case 10: return SHOW;
            case 12:
            default: return EXIT;
        }
    }
}
 */
