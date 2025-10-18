package array2;

public class Array2D {
    public String getMatrixInfo(int [][] matrik){
        StringBuilder hasil =new StringBuilder();
        int sum=0;
        int elemetcount=0;
        for (int i=0; i<matrik.length; i++){//deklarasi sebagai kolom
            hasil.append("Row ").append(i+1).append(": ");
            for (int j=0; j<matrik[i].length; j++){//deklarasi j sebagai baris
                int angka = matrik[i][j];
                sum += angka;//sum + angka
                elemetcount++; //penambahan elementcount +1
                hasil.append(angka).append(angka %2 == 0 ? "E" : "O").append(" ");
            }
            hasil.setLength(hasil.length() -1);//pengurangan baris spasi terakhir
            hasil.append(" \n");
        }
        hasil.append("Total: ").append(sum).append("\n");
        double Average = (double) sum/elemetcount;
        hasil.append("Average: ").append(String.format("%.1f", Average));

        return hasil.toString();
    }
    
}
