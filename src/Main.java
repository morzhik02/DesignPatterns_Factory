import org.jetbrains.annotations.NotNull;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory victorianFurnitureStyle = new VictorianFurnitureFactory();
        FurnitureFactory modernFurnitureStyle = new ModernFurnitureFactory();
        FurnitureFactory artDecoFurnitureStyle = new ArtDecoFurnitureFactory();

        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            System.out.println( "Would you want to order the furniture?\n" +
                                "Please answer:\n" +
                                "  1 - yes,\n" +
                                "  0 - no.");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println( "Choose custom furniture:\n" +
                                    "1 - Chair\n" +
                                    "2 - Sofa\n" +
                                    "3 - Table");
                int inputFurniture = scanner.nextInt();

                System.out.println( "Choose a custom furniture style:\n" +
                                    "1 - ArtDeco\n" +
                                    "2 - Victorian\n" +
                                    "3 - Modern");
                int inputStyle = scanner.nextInt();

                switch (inputFurniture) {
                    case 1:
                        switch (inputStyle) {
                            case 1:
                                Chair chairArtDeco = artDecoFurnitureStyle.createChair();
                                System.out.println("You choose chair in ArtDeco Style\n");
                                orderChair(chairArtDeco);
                                break;

                            case 2:
                                Chair chairVictorian = victorianFurnitureStyle.createChair();
                                System.out.println("You choose chair in Victorian Style\n");
                                orderChair(chairVictorian);
                                break;

                            case 3:
                                Chair chairModern = modernFurnitureStyle.createChair();
                                System.out.println("You choose chair in Modern Style\n");
                                orderChair(chairModern);
                                break;

                        }
                        break;
                    case 2:
                        switch (inputStyle) {
                            case 1:
                                Sofa sofaArtDeco = artDecoFurnitureStyle.createSofa();
                                System.out.println("You choose sofa in ArtDeco Style\n");
                                orderSofa(sofaArtDeco);
                                break;

                            case 2:
                                Sofa sofaVictorian = victorianFurnitureStyle.createSofa();
                                System.out.println("You choose sofa in Victorian Style\n");
                                orderSofa(sofaVictorian);
                                break;

                            case 3:
                                Sofa sofaModern = modernFurnitureStyle.createSofa();
                                System.out.println("You choose sofa in Modern Style\n");
                                orderSofa(sofaModern);
                                break;
                        }
                        break;
                    case 3:
                        switch (inputStyle) {
                            case 1:
                                CoffeeTable coffeeTableArtDeco = artDecoFurnitureStyle.createCoffeeTable();
                                System.out.println("You choose coffee table in ArtDeco Style\n");
                                orderCoffeeTable(coffeeTableArtDeco);
                                break;

                            case 2:
                                CoffeeTable coffeeTableVictorian = victorianFurnitureStyle.createCoffeeTable();
                                System.out.println("You choose coffee table in Victorian Style\n");
                                orderCoffeeTable(coffeeTableVictorian);
                                break;

                            case 3:
                                CoffeeTable coffeeTableModern = modernFurnitureStyle.createCoffeeTable();
                                System.out.println("You choose coffee table in Modern Style\n");
                                orderCoffeeTable(coffeeTableModern);
                                break;
                        }
                        break;
                }
            }
        }
    }

    public static void orderChair(@NotNull Chair chair) {
        System.out.println( chair.hasLegs() +
                            chair.sitOn() +
                            chair.makeChair() +
                            chair.endOfMaking());
    }

    public static void orderSofa(@NotNull Sofa sofa) {
        System.out.println( sofa.backSofa() +
                            sofa.seatSofa() +
                            sofa.makeSofa() +
                            sofa.endOfMaking());
    }

    public static void orderCoffeeTable(@NotNull CoffeeTable coffeeTable) {
        System.out.println( coffeeTable.hasLegs() +
                            coffeeTable.tableTop() +
                            coffeeTable.makeCoffeeTable() +
                            coffeeTable.endOfMaking());
    }
}