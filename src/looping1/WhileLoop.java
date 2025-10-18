package looping1;

public class WhileLoop {
    public int getEvenNumbersAndSum(int codeInput){
        int sum = 0;
        int i = 1;
        while (i <= codeInput) {
            if (i % 2 == 0){
                sum += i;
            }
            i++;
            
        }return sum;
    }
}
