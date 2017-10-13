package MapProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by dela on 3/22/17.
 */
public class LoadProperties {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("./src/MapProperties/person.properties"));

        System.out.print(props.getProperty("username"));
        System.out.print(props.getProperty("passwd"));
    }
}
