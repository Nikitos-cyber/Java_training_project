package String;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        String str ="google";
        String str2 = "cloud";
        System.out.println(str.concat(str2));
        System.out.println("str[2] = " + str.charAt(2));
        System.out.println("Equals: " + str.equals(str2));
        System.out.println("indexLastOf: " + str.lastIndexOf('g'));
        System.out.println(str.replace('d', 'D'));
        System.out.println(str.replaceAll("cloud", "loud"));
        System.out.println(str.replaceFirst("0","0"));
        System.out.println(Arrays.toString(str.split("l")));
        System.out.println(str.substring(6));
        System.out.println(str.toUpperCase(Locale.ROOT));

    }
}
