public class Main {
    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka(10);

        Ksiazka k1 = new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", 1834);
        Ksiazka k2 = new Ksiazka("Hobbit", "J.R.R. Tolkien", 1937);
        biblioteka.dodajKsiazke(k1);
        biblioteka.dodajKsiazke(k2);

        Czytelnik czyt = new Czytelnik("Anna", "Nowak", "K-100", 0);

        System.out.println("--- Stan przed wypożyczeniem ---");
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("\n--- Akcja wypożyczania ---");
        biblioteka.wypozyczKsiazke("Hobbit", czyt);

        System.out.println("\n--- Stan po wypożyczeniu ---");
        biblioteka.wypiszDostepneKsiazki();
        czyt.wypiszDane();
    }
}