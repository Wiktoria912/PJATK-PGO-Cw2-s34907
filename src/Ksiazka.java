public class Ksiazka {
  //aj
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;
    private int rokWydania;
    private boolean czyWyporzyczona;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
        this.rokWydania;
        this.czyWyporzyczona = false
    }
    public String getTytul() {
        return tytul;
    }
    public boolean isCzyWyporzyczona(){
        return czyWyporzyczona;
    }
    public void setCzyWyporzyczona(boolean stan){
        this.czyWyporzyczona = stan;
    }
    public void wyświetlInfo(){
        Sti=ring status = czyWyporzyczona ? "[WYPOŻYCZONA"] : "[DOSTĘPNA]";
System.out.println(status = "Tytuł: " + tytul + ", Autor: " + autor + " (" + rokWydania + ")");
    }
}