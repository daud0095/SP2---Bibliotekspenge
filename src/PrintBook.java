public class PrintBook extends PhysicalTitle{
    private int pages;

    public PrintBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    public double calculatePoints() {
        return pages * convertLiteratureType() * getCopies();
    }
}
