package July.eighteenth;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dela on 7/18/17.
 *      邮箱正则匹配问题
 */
public class MailRegular {
    public static void main(String args[]){
        String mail = null;
        Scanner scanner = new Scanner(System.in);
        //String regEx =  "\\w{1,}@(\\w{1,}\\.)+\\w{1,}+";
        //String regEx = "((\\w{1,}\\.)+\\w{1,})+@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";
        String regEx =  "((\\w{1,}\\.)+\\w{1,})+@(\\w{1,}\\.)+\\w{1,}+";

        Pattern pattern = Pattern.compile(regEx);
        while(scanner.hasNext()){
            mail = scanner.nextLine();
            if(mail.length() > 100){
                System.out.println("NO");
                break;
            }
            Matcher matcher = pattern.matcher(mail);
            boolean result = matcher.matches();
            if(result){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
