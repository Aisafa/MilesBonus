public class Main {
    public static void main(String[] args) {
        long ticketPrice = 10870;
        int bonusPerMile = 20;
        long totalBonusMiles = ticketPrice / bonusPerMile;
        System.out.print("Your bonus Miles = ");
        System.out.println(totalBonusMiles);
    }
}
