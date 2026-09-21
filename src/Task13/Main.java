package Task13;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int players =  scanner.nextInt();
        final int card = 5;

        String[] suits = {
                "Пик", "Бубен", "Черв", "Треф"
        };

        String[] rank = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Королева", "Король", "Туз"
        };

        String[] pullCards = new String[((card + 1) * players) - 1 ];
        int index = 0; int count = 0;

                for(int j = 0; j < suits.length; ++j){

                    for(int k = 0; k < rank.length; ++k){
                        if(count < card) {
                            pullCards[index] = (new StringBuilder(suits[j]).append(" ").append(rank[k])).toString();
                            index++;
                            count++;
                        }else{
                            if(index == pullCards.length) {
                                System.out.println(Arrays.toString(pullCards));
                                return;
                            }
                            pullCards[index] = " ";
                            index++;
                            count = 0;
                        }

                    }

                }




        scanner.close();
    }
}
