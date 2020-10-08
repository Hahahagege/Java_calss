package JavaCode;

public class Book_Test {
    public static void main(String[] args){
        Book javaBook = new Book();
        javaBook.isbn="123-456-789";
        javaBook.nameString="JAVA面向对象";
        javaBook.price=99;
        javaBook.isBorrowed=false;
        System.out.println(javaBook.getInfo());
        javaBook.borrow();
        System.out.println("\n"+"实行了borrow方法之后"+"\n");
        System.out.println(javaBook.getInfo());
    }
}
