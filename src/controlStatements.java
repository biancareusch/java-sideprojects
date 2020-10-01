public class controlStatements {
    public static boolean canSellTobacco(int age) {
        System.out.println("Checking if cashier can sell tobacco.");
        return age >= 18;
    }

    public static boolean canSellAlcohol(int age) {
        System.out.println("Checking if cashier can sell alcohol.");
        return age >= 21;
    }
}
