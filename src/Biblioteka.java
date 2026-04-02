public void wypozyczKsiazke(String tytul, Czytelnik czytelnik) {
    for (int i = 0; i < liczbaKsiazek; i++) {
        if (ksiazki[i].getTytul().equals(tytul)) {
            if (!ksiazki[i].isCzyWypozyczona()) {
                ksiazki[i].setCzyWypozyczona(true);
                czytelnik.zwiekszLiczbeWypozyczycen();
                System.out.println("Wypożyczono: " + tytul + " czytelnikowi: " + czytelnik.nazwisko);
            } else {
                System.out.println("Książka " + tytul + " jest już zajęta.");
            }
            return;
        }
    }
    System.out.println("Brak książki o tym tytule.");
}