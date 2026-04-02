public class Ebook extends Ksiazka {
    private double rozmiarPliku; // pole dla ebooka
    private String format;

    //Ebook
    public Ebook(String tytul, String autor, int rokWydania, double rozmiarPliku, String format) {
        super(tytul, autor, rokWydania);
        this.rozmiarPliku = rozmiarPliku;
        this.format = format;
    }

    //info o rozmiarze
    @Override
    public void wyswietlInfo() {
        super.wyswietlInfo(); // Wywołuje to, co już było w Ksiazka
        System.out.println("Format: " + format + ", Rozmiar: " + rozmiarPliku + "MB");
    }
}