public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public String hasLegs() {
        return "Prepare coffee table legs in ArtDeco style...\n";
    }

    @Override
    public String tableTop() {
        return "Prepare coffee table top in ArtDeco style...\n";
    }

    @Override
    public String makeCoffeeTable() {
        return "Making coffee table...\n";
    }

    @Override
    public String endOfMaking() {
        return "The production of a coffee table in the ArtDeco style is finished. The order is ready!\n";
    }
}
