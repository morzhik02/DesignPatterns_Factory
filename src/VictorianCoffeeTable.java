public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public String hasLegs() {
        return "Prepare coffee table legs in Victorian style...\n";
    }

    @Override
    public String tableTop() {
        return "Prepare coffee table top in Victorian style...\n";
    }

    @Override
    public String makeCoffeeTable() {
        return "Making coffee table...\n";
    }

    @Override
    public String endOfMaking() {
        return "The production of a coffee table in the Victorian style is finished. The order is ready!\n";
    }
}
