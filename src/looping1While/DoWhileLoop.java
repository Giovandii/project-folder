package looping1While;

public class DoWhileLoop {
    public int getOddNumbersAndSum(int codeInput){
        int sum=0;
        int i  =1;

        if(codeInput < 1){
            return 0;
        }
        do {
           if (i % 2 == 1){
            sum += i;
           }i++;
        } while (i<=codeInput);
        return sum;
    }
    
}
