public class Main {
    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("Wiedźmin", "Andrzej Sapkowski", 320, true);
        Ksiazka k2 = new Ksiazka("Hobbit", "J.R.R. Tolkien", 310, true);
        Ksiazka k3 = new Ksiazka("1984", "George Orwell", 350, true);
        k1.wypiszInfo(); // Wypisuje dane
        k1.wypozycz();
        System.out.println("Po wypożyczeniu:");
        k1.wypiszInfo();
    }
}