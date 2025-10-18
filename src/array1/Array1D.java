package array1;

public class Array1D {
    public String getArrayInfo(int [] codeInput){
        StringBuilder hasil = new StringBuilder();
// deklarasi sum
        int sum =0;
        for (int angka : codeInput){
            hasil.append(angka).append(" ");
// penjumlahan sum + angka
            sum += angka;
        }
        if (hasil.length() > 0){
            hasil.setLength(hasil.length() -1 );
        }
// output hasil sum(penjumlahan)
        hasil.append("\nSum: ").append(sum);
        return hasil.toString();
    }
    
}
