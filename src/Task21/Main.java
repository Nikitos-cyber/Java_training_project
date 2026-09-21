package Task21;

public class Main {
    public static String text = "Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available. It is also used to temporarily replace text in a process called greeking, which allows designers to consider the form of a webpage or publication, without the meaning of the text influencing the design.z";

    public static String encrypt(String text, int shift) {

        for(int i = 0; i < text.length(); ++i){
            char ch = text.charAt(i);

            if(isEnglish(ch))
                ch = encryptWords(ch,shift,26);

            else if(isRussian(ch))
               ch = encryptWords(ch,shift,32);

         if(i + 1 < text.length())
             text = text.substring(0,i) + ch  + text.substring(i+1);
         else
             text = text.substring(0,i) + ch;

        }

        return text;
    }
    public static boolean isEnglishLower(char ch){
        return ch >= 'a' && ch <= 'z';
    }
    public static boolean isEnglishUpper(char ch){
         return ch >= 'A' && ch <= 'Z';
    }
    public static boolean isEnglish(char ch){
       return isEnglishLower(ch) || isEnglishUpper(ch);
    }

    public static boolean isRussianLower(char ch){
        return ch >= 'а' && ch <= 'я';
    }
    public static boolean isRussianUpper(char ch){
        return ch >= 'А' && ch <= 'Я';
    }
    public static boolean isRussian(char ch){
        return isRussianLower(ch) || isRussianUpper(ch);
    }



    public static String decrypt(String text, int shift) {
        return encrypt(text, shift * (-1));
    }

    public static char encryptWords(char ch, int shift, int words ){

        shift %= words;

        if(isEnglishLower(ch)) {
            if (ch + shift > 'z')
                ch = (char) (('a' - 1) + (shift - ((int) 'z' - ch)));
            else if (ch + shift < 'a')
                ch = (char) (('z' + 1) + (shift + ((int) ch - 'a')));
        }else if(isEnglishUpper(ch)){
              if (ch + shift > 'Z')
                ch = (char) (('A' - 1) + (shift - ((int) 'Z' - ch)));
            else if (ch + shift < 'A')
                ch = (char) (('Z' + 1) + (shift + ((int) ch - 'A')));

        }else if(isRussianLower(ch)){
            if(ch + shift > 'я')
                ch = (char) (('а' - 1) + (shift - ((int) 'я' - ch)));
            else if (ch + shift < 'а')
                ch = (char) (('я' + 1) + (shift + ((int) ch - 'а')));
        }else if(isRussianUpper(ch)){
            if (ch + shift > 'Я')
                ch = (char) (('А' - 1) + (shift - ((int) 'Я' - ch)));
            else if (ch + shift < 'А')
                ch = (char) (('А' + 1) + (shift + ((int) ch - 'Я')));
        }

        return  (char)(ch + shift);
    }


    public static void main(String[] args) {
        String newStr = encrypt(text, 5);
        System.out.println(newStr);
        System.out.println(decrypt(newStr,5));
    }
}
