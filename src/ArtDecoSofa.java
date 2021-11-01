public class ArtDecoSofa implements Sofa {
    @Override
    public String seatSofa() {
        return "Prepare sofa seat in ArtDeco style...\n";
    }

    @Override
    public String backSofa() {
        return "Prepare sofa back in ArtDeco style...\n";
    }

    @Override
    public String makeSofa() {
        return "Making sofa...\n";
    }

    @Override
    public String endOfMaking() {
        return "The production of a sofa in the ArtDeco style is finished. The order is ready!\n";
    }
}
