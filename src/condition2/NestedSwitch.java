package condition2;

public class NestedSwitch {
    public String getSelection(int katagori ,int Choice){
        switch (katagori){
            case 2:
            switch (Choice){
                case 1:
                return katagori + ", You selected: Pizza";
                default:
                return katagori + ", Invalid food choice";
            }
        }
        switch (katagori){
            case 1:
            switch (Choice){
                case 2:
                return katagori + ", You selected: Coffee";
                default:
                return katagori + ", Invalid drink choice";
            }
            default:
            return katagori + ", Invalid category";
        }
    }
    
}
