package ClassTwo;

import java.util.Scanner;

/**
 * Created by dela on 11/14/17.
 */
public class Main1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String telephone = scanner.next();
        String eMail = scanner.next();

        Address address = new Address(name, telephone, eMail);
        address.show();
    }
}
class Address {
    private String name;
    private String telephone;
    private String eMail;

    public Address(String name, String telephone, String eMail){
        this.name = name;
        this.telephone = telephone;
        this.eMail = eMail;
    }

    public Address(){}

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String geteMail() {
        return eMail;
    }

    public void show(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "name=" + this.getName() + ",telephone="
                + this.getTelephone() + ",eMail=" + this.geteMail();
    }
}
