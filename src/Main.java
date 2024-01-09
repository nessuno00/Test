public class Main {

    public static void main(String[] args) {

        Magazzino magazzino = new Magazzino();

        magazzino.aggiungiProdotto("Notebook", "Elettronica", "in offerta");
        magazzino.aggiungiProdotto("Tavolo", "Mobile", "Un tavolo in acciaio");
        magazzino.aggiungiProdotto("Sedia", "Mobile", "Un sedia di legno");
        magazzino.aggiungiProdotto("Jeans", "Vestiti", "Jeans in cuoio");

        magazzino.visuallizaInventario();

    }
}
