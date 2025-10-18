package function2;

public class Factorial {
    public int factorial(int AngkaFac){
        if (AngkaFac == 0){
            return 1;
        }else{
            return AngkaFac * factorial(AngkaFac-1);
        }
        
    }
    
}
