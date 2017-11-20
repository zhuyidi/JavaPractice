package ClassThree;


import java.util.Scanner;

/**
 * Created by dela on 11/20/17.
 */

interface ClassName {
    String getClassName();
}

class Company implements ClassName {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    @Override
    public String getClassName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company(scanner.next());
        System.out.println("name=" + company.getClassName());
    }
}
