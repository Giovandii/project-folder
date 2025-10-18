package Operator;

public class Number {

    public String getOperatorResults(int nomorA,int nomorB){
        return "Sum: " + (nomorA + nomorB) + "\n" +
                "Product: " + (nomorA*nomorB) + "\n" +
                "Is Equal: "+ (nomorA == nomorB) + "\n" +
                "Logical AND: " + (nomorA > 0 && nomorB > 0) +"\n"+
                "Logical OR: " + (nomorA < 0 || nomorB > 0) ;
        
    }
}
