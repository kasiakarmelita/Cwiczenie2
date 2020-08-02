public enum Dzialania {
    DODAWANIE("+"),
    ODEJMOWANIE("-"),
    MNOZENIE("*"),
    DZIELENIE("/");

    private final String znak;

    Dzialania(String znak) {
        this.znak = znak;


    }


    public String getZnak() {
        return znak;
    }
}


