package looping2while;

public class DoWhileLoopNested {
    public String getNumberTriangle( int Nosegitiga){

        StringBuilder hasil = new StringBuilder();
        int i = 1;
        do {
            int j = 1;
            do {
                hasil.append(j);
                j++;
            } while (j <= i);

            if (i < Nosegitiga) {
                hasil.append("\n");
            }

            i++;
        } while (i <= Nosegitiga);

        return hasil.toString();
    }
}


