package Controller;

public class ButtonInfo {

    boolean isOperator;
    boolean isEquals;
    boolean isDot;
    boolean isNumber;
    boolean isClear;

    public ButtonInfo (String buttonText){

        readButtonValue(buttonText);

    }

    //function and switch case
    private void readButtonValue(String buttonText) {
        switch (buttonText){
            case "C" : isClear = true; break;

            case "1" : isNumber = true; break;
            case "2" : isNumber = true; break;
            case "3" : isNumber = true; break;
            case "4" : isNumber = true; break;
            case "5" : isNumber = true; break;
            case "6" : isNumber = true; break;
            case "7" : isNumber = true; break;
            case "8" : isNumber = true; break;
            case "9" : isNumber = true; break;
            case "0" : isNumber = true; break;

            case "." :  isDot = true; break;

            case "+" : isOperator = true; break;
            case "-" :  isOperator = true; break;
            case "*" : isOperator = true; break;
            case "/" :  isOperator = true; break;

            case "=" : isEquals = true; break;

            default : System.out.println("BUTTON TYPE NOT FOUND");
        }

    }

    public boolean isNumber() {
        return isNumber;
    }

    public boolean isOperator() {
        return isOperator;
    }

    public boolean isEquals() {
        return isEquals;
    }

    public boolean isDot() {
        return isDot;
    }

    public boolean isClear() {
        return isClear;
    }
}

//a new unusual comment has been added
