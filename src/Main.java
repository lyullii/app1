public class Main {
    public static void main(String[] args) {
        long[] sales = new long[] {1, 4, 10, 15};
        SalesManager salesManager = new SalesManager(sales);

        long max = salesManager.max();

        System.out.println(max);
    }
}