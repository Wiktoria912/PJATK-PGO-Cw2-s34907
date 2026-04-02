public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    // Wielkość biblioteki
    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
        this.liczbaKsiazek = 0;
    }
    //Dodaie książki do tablicy
    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        } else {
            System.out.println("Biblioteka jest pełna!");
        }
    }

    // Wypisuje wszystkie książki
    public void wypiszDostepneKsiazki() {
        for (int i = 0; i < liczbaKsiazek; i++) {
            ksiazki[i].wyswietlInfo();
        }
    }

    // Wyszukiwanie książki po tytule
    public void znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            // .equals() porównywanie tekstów w Javie
            if (ksiazki[i].getTytul().equals(tytul)) {
                ksiazki[i].wyswietlInfo();
                return;
            }
        }
        System.out.println("Nie znaleziono książki o tytule: " + tytul);
    }
}