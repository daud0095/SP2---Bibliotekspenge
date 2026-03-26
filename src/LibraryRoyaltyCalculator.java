public class LibraryRoyaltyCalculator {
    public static void main(String[] args){

        Author daniel = new Author("Daniel");
        daniel.addTitle(new PrintBook("RICH", "FAG", 140, 166));
        daniel.addTitle(new AudioBook("POOR", "SKØN", 120, 210));

        daniel.addTitle(new EBook("BOG", "FAG", 95, 50, 200, 360000, false));

        System.out.println(daniel.getName() + ": " + daniel.calculateRoyalties() + "kr");
    }

}
