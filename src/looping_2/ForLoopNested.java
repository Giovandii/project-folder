package looping_2;

public class ForLoopNested {
    public String getGrid(int codeInput){
        StringBuilder kotak = new StringBuilder();

        for(int row = 1; row <= codeInput; row++){
            
            for(int colom = 1; colom <= codeInput;colom++ ){
                kotak.append("Row ").append(row).append(" Col ").append(colom);

                if (colom < codeInput){
                    kotak.append("\n");
                }

            }if (row<codeInput){
                kotak.append("\n");
            }
        }return kotak.toString();
    }
}
