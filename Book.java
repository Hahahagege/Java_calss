package JavaCode;

public class Book {
    String isbn;
    double price;
    String nameString;
    boolean isBorrowed;//true表示能借，false表示不能借

    public boolean borrow(){
        isBorrowed=!isBorrowed;
        return isBorrowed;
    }

    public  String getInfo(){
        return "isbn:"+isbn+"\n"+"name:"+nameString+"\n"+"price:"+price+"\n"+"isBorrowed:"+isBorrowed;
    }

}
