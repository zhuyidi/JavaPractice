package ClassOne;

/**
 * Created by dela on 10/18/17.
 */
public class Book {
    public static int Sno = 1;
    public static int count = 0;

    private int no;
    private String bookName;
    private double price;

    public Book(String bookName, int no, double price){
        this.bookName = bookName;
        this.no = no;
        this.price = price;
    }

    public void print(){
        System.out.println("书名: " + this.bookName + ", 书号: " + this.no + ", 书价: " + this.price);
    }
}
