public class Czytelnik {
    //klasy
    public String imie;
    public String nazwisko;
    public String numerKarty;
    public int liczbaWypozyczycen;

    //dane
    public Czytelnik(String imie, String nazwisko, String numerKarty, int liczbaWypozyczycen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczycen = liczbaWypozyczycen;
    }
    public void wypiszDane() {
        System.out.println("Czytelnik: " + imie + " " + nazwisko +
                " | Nr karty: " + numerKarty +
                " | Wypożyczone: " + liczbaWypozyczycen);
    }
    public void zwiekszLiczbeWypozyczycen() {
        liczbaWypozyczycen++;
    }
    public void zmniejszLiczbeWypozyczycen() {
        if (liczbaWypozyczycen > 0) {
            liczbaWypozyczycen--;
        }
    }
}