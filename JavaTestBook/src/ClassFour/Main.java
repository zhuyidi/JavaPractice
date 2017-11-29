package ClassFour;


import java.util.*;

/**
 * Created by dela on 11/29/17.
 */

class IntArray {
    private int length = 0;
    private int[] array;

    public IntArray() {
        array = new int[5];
    }

    public void addElement(int val) {
        if(length != 0 && length % 5 == 0) {
            array = Arrays.copyOf(array, length + 5);
        }
        array[length++] = val;
    }

    public int getElement(int index) {
        return array[index];
    }

    public int getLength() {
        return length;
    }

}

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        IntArray intArray = new IntArray();

        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            intArray.addElement(scanner.nextInt());
        }

        for(int i = 0; i < count; i++) {
            System.out.print(intArray.getElement(i) + " ");
        }

        System.out.println("length=" + intArray.getLength());

    }
}