public class Main {
    public static void main(String[] args) {
        Biblioteka mojaBiblioteka = new Biblioteka(3);

        Ksiazka k1 = new Ksiazka("Wiedźmin", "Sapkowski", 1992);
        // Tworzymy Ebooka!
        Ebook e1 = new Ebook("Czysty Kod", "Robert C. Martin", 2008, 15.5, "PDF");

        mojaBiblioteka.dodajKsiazke(k1);
        mojaBiblioteka.dodajKsiazke(e1); // To zadziała, bo Ebook to też Ksiazka!

        mojaBiblioteka.wypiszDostepneKsiazki();
    }
}