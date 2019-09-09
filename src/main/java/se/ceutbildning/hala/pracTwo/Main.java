package se.ceutbildning.hala.pracTwo;

public class Main {
    private static Book[] book = new Book[5];
    public static void main(String[] args) throws Exception {
        Aouther aouther1 = new Aouther("auther1","autherson","auther1@auther");
        Aouther aouther2 = new Aouther("auther2","autherson","auther1@auther");
        Aouther aouther3 = new Aouther("auther3","autherson","auther1@auther");
        Aouther aouther4 = new Aouther("auther4","autherson","auther1@auther");

        book[0] = new ChildBook(aouther1,2019,"deckare","mord1");
        book[1] = new AdultBook(aouther2,2017,"poet","poet");
        book[2] = new ChildBook(aouther3,2018,"komedi","komedi");
        book[3] = new AdultBook(aouther4,2016,"fantasi","fantasi");
        book[4] = new ChildBook(aouther1,2015,"fakta","fakta");


        for (Book object: book){
            //System.out.println(object);
            if(object instanceof AdultBook)
                System.out.println(object.getTitle());
        }
    }
}
