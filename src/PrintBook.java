public class PrintBook extends Title{
    private int pages;
    private int copies;

    public PrintBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType);
        this.pages = pages;
        this.copies = copies;
    }

    @Override
    public double calculatePoints() {
        return pages * convertLiteratureType() * copies;
    }
}
