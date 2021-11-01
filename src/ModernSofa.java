public class ModernSofa implements Sofa {

    @Override
    public String seatSofa() {
        return "Prepare sofa seat in Modern style...\n";
    }

    @Override
    public String backSofa() {
        return "Prepare sofa back in Modern style...\n";
    }

    @Override
    public String makeSofa() {
        return "Making sofa...\n";
    }

    @Override
    public String endOfMaking() {
        return "The production of a sofa in the Modern style is finished. The order is ready!\n";
    }
}
