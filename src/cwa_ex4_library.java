class library{
    String[] magazines;
    int no_of_magazines;
    library(){
       this.magazines =new String[100];
        this.no_of_magazines =0;
    }
    void addbook(String book){
        this.magazines[no_of_magazines]=book;
        no_of_magazines++;
        System.out.println("book has been added :" +book);
    }
    void showAvailableBooks(){
        System.out.println("Available books are:");
        for(String book:this.magazines){
            if(book==null){
                continue;
            }
            System.out.println("*" +book);
        }
    }
    void issueBooks(String book){
        for(int i=0;i<this.magazines.length;i++){
            if(this.magazines[i].equals(book)){
                System.out.println("the book has been issued:");
                this.magazines[i]=null;
                return;
            }
        }
        System.out.println("the book doesn't exist.");
    }
void returnbook(String book){
        addbook(book);
}
}


public class cwa_ex4_library {
    public static void main(String[] args) {
library centrallibrary=new library();
centrallibrary.addbook("thrones");
centrallibrary.addbook("wwe");
centrallibrary.addbook("charlie chocolate");
centrallibrary.issueBooks("thrones");
centrallibrary.showAvailableBooks();
centrallibrary.returnbook("thrones");
    }
}
