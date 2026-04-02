public class Ksiazka {
  //aj
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }
    public void wypiszInfo() {
        System.out.println("Książka: " + tytul + " | Autor: " + autor +
                " | Stron: " + liczbaStron + " | Dostępna: " + dostepna);
    }
    public void wypozycz() {
        this.dostepna = false;
    }
    public void zwroc() {
        this.dostepna = true;
    }
    public String getTytul() {
        return tytul;
    }
    public boolean isDostepna() {
        return dostepna;
    }
    public String getTytul() {
        return tytul;
    }
}