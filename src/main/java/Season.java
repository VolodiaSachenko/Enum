public enum Season {

    SUMMER(35), WINTER(-2), AUTUMN(14), SPRING(20);

    private final int TEMPERATURE;

    Season(int temperatue) {
        this.TEMPERATURE = temperatue;
    }

    public int getTEMPERATURE() {
        return TEMPERATURE;
    }
}
