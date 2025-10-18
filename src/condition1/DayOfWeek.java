package condition1;

import java.lang.classfile.instruction.SwitchCase;

public class DayOfWeek {
    public String getDayName(int codeInputDay){
        String DayOfWeek;

        switch (codeInputDay) {
            case 1: 
                DayOfWeek = "Monday";
                break;
            case 2:
                DayOfWeek = "Thuesday";
                break;
            case 3:
                DayOfWeek = "Wednesday";
                break;
            case 4:
                DayOfWeek = "Thursday";
                break;
            case 5:
                DayOfWeek = "Friday";
                break;
            case 6:
                DayOfWeek = "Saturdaay";
                break;
            case 7:
                DayOfWeek = "Sunday";
            default:
            DayOfWeek = "Unknown";
                break;
        }
        return "Day: " +DayOfWeek;
    }
    
}
