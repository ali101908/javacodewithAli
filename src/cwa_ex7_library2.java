import java.util.ArrayList;

class book {
    public String name, author;

    public book(String name,String author) {
        this.name = name;
        this.author=author;
    }

 //   @Override
 //   public String toString() {
//        return "";
 //   }
}
    class MyLibrary{
        public ArrayList<book> books;
        public MyLibrary(ArrayList<book>books){
            this.books=books;
        }
        public void addbook(book Book){
            System.out.println("the book has been added");
            this.books.add(Book);
        }
        public void issuebook(book Book,String issued_to){
            System.out.println("the book has been issued" +issued_to);
            this.books.remove(Book);
        }
        public void returnbook(book b){
            System.out.println("the book has been returned");
            this.books.add(b);
        }
    }


public class cwa_ex7_library2 {
    public static void main(String[] args) {
ArrayList<book>bk=new ArrayList<>();
book b1=new book("algo1","clss");
        bk.add(b1);
        book b2=new book("algo2","clss2");
        bk.add(b2);
        book b3=new book("algo3","clss3");
        bk.add(b3);
MyLibrary Ml=new MyLibrary(bk);
Ml.addbook(new book("algorithms","clschika4"));
        System.out.println(Ml.books);
Ml.issuebook(b2," Ali ");
        System.out.println(Ml.books);
    }
}
