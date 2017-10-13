package CollectionAndSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by dela on 3/23/17.
 */
public class SetAndStringSplit {
    static Set getWord(String words){
        String[] get = words.split("end");
        //这里的"end"只是用来测试string类的分隔符,常用的分隔符为" "或"\n"
        return new HashSet(Arrays.asList(get));
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.println("请输入英文:");
        Set words = getWord(console.nextLine());
        System.out.printf("不重复的单词有%d个:%s\n", words.size(), words);
    }
}
