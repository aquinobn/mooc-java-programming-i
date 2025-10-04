public class Book {
    private String name;
    private Integer pages;
    private Integer year;

    public Book (String initialName, Integer initialPages, Integer initialYear) {
        this.name = initialName;
        this.pages = initialPages;
        this.year = initialYear;
    }

    public String toString(String selection) {
        
        if (selection.equals("everything")) {
            return this.name+", "+this.pages+" pages, "+this.year;    
        }
        if (selection.equals("name")) {
            return this.name;    
        }
        return "";
    }
}
