public class Main {
    public static void main(String[] args) {
        // Tworzymy dwóch czytelników
        Czytelnik c1 = new Czytelnik("Jan", "Kowalski", "K-123", 2);
        Czytelnik c2 = new Czytelnik("Anna", "Nowak", "K-987", 0);

        // Wywołujemy metody dla pierwszego czytelnika
        c1.zwiekszLiczbeWypozyczycen();
        c1.wypiszDane();

        // Wywołujemy metody dla drugiego czytelnika
        c2.wypiszDane();
    }
}