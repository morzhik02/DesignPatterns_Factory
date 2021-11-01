public class VictorianChair implements Chair {
    @Override
    public String hasLegs() {
        return "Prepare chair legs in Victorian style...\n";
    }

    @Override
    public String sitOn() {
        return "Prepare chair sit in Victorian style...\n";
    }

    @Override
    public String makeChair() {
        return "Making chair...\n";
    }

    @Override
    public String endOfMaking() {
        return "The production of a chair in the Victorian style is finished. The order is ready!\n";
    }


}
