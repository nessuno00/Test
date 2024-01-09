import java.util.ArrayList;

public class Magazzino {

    private ArrayList<Prodotto> inventario;

    public Magazzino() {

        inventario = new ArrayList<>();
    }

    public void aggiungiProdotto(String name, String type, String description) {

        Prodotto nuovoProdotto = new Prodotto(name, type, description);

        inventario.add(nuovoProdotto);
    }

    public void visuallizaInventario() {

        System.out.println("Dettagli del magazzino");
        for (Prodotto prodotto : inventario) {

            prodotto.StampaDettagli();
        }

    }
}
