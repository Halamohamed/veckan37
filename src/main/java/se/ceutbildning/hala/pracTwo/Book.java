package se.ceutbildning.hala.pracTwo;

public abstract class Book {
    private Aouther aouther;
    private int year;
    private String category;
    private String title;
    private int pagesOfbook;

    public Book(Aouther aouther, int year, String category, String title) {
        this.aouther = aouther;
        this.year = year;
        this.category = category;
        this.title = title;
        this.pagesOfbook = 100;
    }
    public Book(Aouther aouther, int year, String category, String title,int pagesOfbook) {
        this.aouther = aouther;
        this.year = year;
        this.category = category;
        this.title = title;
        this.pagesOfbook = pagesOfbook;
    }

    public Aouther getAouther() {
        return aouther;
    }

    public void setAouther(Aouther aouther) {
        this.aouther = aouther;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagesOfbook() {
        return pagesOfbook;
    }

    public void setPagesOfbook(int pagesOfbook) {
        this.pagesOfbook = pagesOfbook;
    }

    public abstract void show();

    @Override
    public String toString() {
        return "Book{" +
                "aouther=" + aouther +
                ", year=" + year +
                ", category='" + category + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
