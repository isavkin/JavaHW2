public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 1640;
        int miles = service.calculate(ticketPrice);
        System.out.print(miles);
    }
}
