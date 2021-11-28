public enum Animal {

    DOG("пес \uD83D\uDC15"), CAT("кіт \uD83D\uDC08"), FROG;

    private String translation;

    Animal() {
    }

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
