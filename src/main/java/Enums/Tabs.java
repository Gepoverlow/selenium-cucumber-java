package Enums;

public enum Tabs {
    BIS,
    INSZ,
    KBO,
    LOREM,
    NIHII,
    PLATES,
    POLIS,
    RIZIV,
    TELEPHONE,
    UUID;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
