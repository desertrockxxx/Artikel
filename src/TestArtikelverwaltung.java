public class TestArtikelverwaltung {

    public static void main(String[] args) {

        Artikel kleid = new Artikel("Sommerkleid", 16.8, false);
        Artikel brot = new Artikel("Bauernbrot", 2.8, true);

        System.out.println(kleid.toString());
        System.out.println(brot.toString());

        brot.setNtPreis(3.04);
        System.out.println("Brot wird teurer -->" + brot.getNtPreis());
        System.out.println(brot.toString());

        kleid.setErmStSa(true);
        System.out.println("Steuersatz für Kleider wird auf 7% gesetzt!" );
        System.out.println(kleid.toString());


    }
}
