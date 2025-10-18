package looping2;

public class WhileLoopNested {
    public String getTriangle(int max){
    StringBuilder triangle = new StringBuilder();
    int row =1;
    while (row <= max) {
    int i =1;
        while (i <= row) {
        triangle.append("*");
        i++;
        }
        if (row < max){
            triangle.append("\n");
        }
        row++;
        }
        return triangle.toString();
    }
}
    

