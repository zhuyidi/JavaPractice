package ClassOne;

/**
/**
 * Created by dela on 10/18/17.
 */
public class BookDemo {
    public static void main(String[] args){
        int i = 0;
        Book[] books = new Book[3];

        while(i < 3){
            books[i] = new Book("Linux私房菜", Book.Sno++, 60.0);
            books[i].print();
            i++;
        }
    }
}
