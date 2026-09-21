package Task6;

public class Main {
    public static void main(String[] args) {
        String str = new String("Hello");
        str = reversArray(str);
        System.out.println(str);
    }

    static String reversArray(String str){
        StringBuilder s = new StringBuilder();
        for(int i = (str.length() - 1); i >= 0; --i){
            s.append( str.charAt(i));
        }
        str = s.toString();
        return str;
    }
}
