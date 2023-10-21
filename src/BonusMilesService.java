public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int bonusCost = 20;
        int accruedBonuses = ticketPrice / bonusCost;
        return accruedBonuses;
    }
}
