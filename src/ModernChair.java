public class ModernChair implements Chair {
    @Override
    public String hasLegs() {
        return "Prepare chair legs in Modern style...\n";
    }

    @Override
    public String sitOn() {
        return "Prepare chair sit in Modern style...\n";
    }

    @Override
    public String makeChair() {
        return "Making chair...\n";
    }

    @Override
    public String endOfMaking() {
        return "The production of a chair in the Modern style is finished. The order is ready!\n";
    }
}
