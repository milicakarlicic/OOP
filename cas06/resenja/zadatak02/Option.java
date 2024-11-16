package cas06.zadatak02;

public enum Option {
    ADD,        // 0
    REMOVE,     // 1
    HEAD,       // 2
    BACK,       // 3
    SIZE,       // 4
    SHOW,       // 5
    EXIT;       // 6

    public static Option castIntToOption(int i) {
        switch (i) {
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
