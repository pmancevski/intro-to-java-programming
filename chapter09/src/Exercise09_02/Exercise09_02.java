package Exercise09_02;

public class Exercise09_02 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.println("Change percentage: " + stock.getChangePercent());
    }
}
