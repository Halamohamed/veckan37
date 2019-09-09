package se.ceutbildning.hala.pracTwo;

import java.util.Arrays;

public class AdultBook extends Book {
    private Book[] books;


    public AdultBook(Aouther aouther, int year, String category, String title) {
        super(aouther, year, category, title);
    }

    public AdultBook(Aouther aouther, int year, String category, String title, int pagesOfbook) {
        super(aouther, year, category, title, pagesOfbook);
    }

    @Override
    public void show() {
        System.out.println(" Adult book");
    }
    public Book searchBook(String title) throws Exception {
       for (Book book : books){
           if(title.equals(book.getTitle()))
               return book;
       }
      throw new Exception("Book does not exist.");
    }

    @Override
    public String toString() {
        return super.toString() + "AdultBook{" +
                "adultBooks=" + Arrays.toString(books) +
                '}';
    }
}
