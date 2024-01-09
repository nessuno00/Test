public class Prodotto {


    private String name;

    private String type;

    private String description;

    private int id;

    private  static int counter = 1000;



    public Prodotto(String name, String type, String description) {

        this.name = name;
        this.type = type;
        this.description = description;
        this.id = ++counter;

    }


    public void StampaDettagli() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Description: " + description);
        System.out.println("-----------------------");

    }

}

