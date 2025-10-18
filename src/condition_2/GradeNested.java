package condition_2;

public class GradeNested {
    public String getGradeInfo(String codeInputSubject,int codeInputScore){
        String Grade;
        if (codeInputSubject.equals("Math")){
            if(codeInputScore >= 90){
                Grade = "A";
            }else if (codeInputScore >= 75 ){
                Grade = "B";
            }else if (codeInputScore >= 60){
                Grade = "C";
            }else{
                Grade = "D";
            }return "Subject: Math, Grade: "+Grade;

        }else if  (codeInputSubject.equals("English")){
            if(codeInputScore >= 85){
                Grade = "A";
            }else if (codeInputScore >= 70 ){
                Grade = "B";
            }else if (codeInputScore >= 60){
                Grade = "C";
            }else{
                Grade = "D";
          }return "Subject: English, Grade: "+Grade;

    }else{
        return "Subject: Unknown, Grade: N/A";
    }
    
}
}
