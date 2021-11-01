public class ArtDecoChair implements Chair {

    @Override
    public String hasLegs() {
        return "Prepare chair legs in ArtDeco style...\n";
    }

    @Override
    public String sitOn() {
        return "Prepare chair sit in ArtDeco style...\n";
    }

    @Override
    public String makeChair() {
        return "Making chair...\n";
    }

    @Override
    public String endOfMaking() {
        return "The production of a chair in the ArtDeco style is finished. The order is ready!\n";
    }
}
