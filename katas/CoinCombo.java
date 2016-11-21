import java.util.*;

public class CoinCombo {
    
    
    
    public static void printSum(int[] coins, int[] quantity) {
        if (coins == null || quantity == null || coins.length != quantity.length) {
            return;
        }
        
        Set sums = new HashSet();
        int n = 0;
        for(int i = 0; i <= 5; i++) {
            for(int j = 0; j <=3; j++) {
                for(int l = 0; l <= 2; l++) {
                    for(int k = 0; k <= 2; k++) {
                        int sum = 10 * i + 50 * j + 100 * l + 500 * k;
                        if (sums.add(sum)) {
                            n++;
                            System.out.println(sum);
                        }
                    }                   
                }
            }
        }
        System.out.println("Total: "+ n);
    }
    
    public static void main(String [] args) {
        int coins[] = {10, 50, 100, 500};
		int quantity [] = {5,3,2,2};    
		printSum(coins, quantity);
		
    }
}