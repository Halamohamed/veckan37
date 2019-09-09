package se.ceutbildning.hala.pracTwo;

import java.util.Arrays;

public class ChildBook extends Book {

    private Book[] childBooks;
    public ChildBook(Aouther aouther, int year, String category, String title) {
        super(aouther, year, category, title);
    }

    public ChildBook(Aouther aouther, int year, String category, String title, int pagesOfbook) {
        super(aouther, year, category, title, pagesOfbook);
    }

    @Override
    public void show() {

        System.out.println(" child book");
    }
    public Book getChildBook(){

        for (Book book : childBooks){
            if( book instanceof ChildBook){
                return book;
            }
        }return null;
    }

    @Override
    public String toString() {
        return super.toString() + "ChildBook{" +
                "childBook=" + Arrays.toString(childBooks) +
                '}';
    }
}
