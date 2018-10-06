package Controller;

public class StringInfo {

boolean isEmpty;
boolean isLastCharacterNumber;
boolean isLastCharacterOperator;    
boolean isLastCharacterDot;
int lastCharIndex;

    public StringInfo(String computationText){

        readStringValue(computationText);

    }

    //function to read string values
    private void readStringValue(String computationText) {

        if (computationText.equals("")) {
            isEmpty = true;
        } else {
            lastCharIndex = computationText.length()-1;
            String lastChar = computationText.substring(lastCharIndex);

            switch(lastChar){
                case "0" : isLastCharacterNumber = true; break; 
                case "1" : isLastCharacterNumber = true; break; 
                case "2" : isLastCharacterNumber = true; break; 
                case "3" : isLastCharacterNumber = true; break; 
                case "4" : isLastCharacterNumber = true; break; 
                case "5" : isLastCharacterNumber = true; break; 
                case "6" : isLastCharacterNumber = true; break; 
                case "7" : isLastCharacterNumber = true; break; 
                case "8" : isLastCharacterNumber = true; break; 
                case "9" : isLastCharacterNumber = true; break; 

                case "+" : isLastCharacterOperator= true; break; 
                case "-" : isLastCharacterOperator= true; break; 
                case "*" : isLastCharacterOperator= true; break; 
                case "/" : isLastCharacterOperator= true; break; 

                case "." : isLastCharacterDot = true; break; 

                default : System.out.println("Cannot parse last character!");

            }

        }


    }

    public boolean isComputationTextEmpty() {
        return isEmpty;
    }


    public boolean isLastCharacterNumber() {
        return isLastCharacterNumber;
    }

    public boolean isLastCharacterOperator() {
        return isLastCharacterOperator;
    }

    public boolean isLastCharacterDot() {
        return isLastCharacterDot;
    }

    public int getLastCharIndex() {
        return lastCharIndex;
    }

}
