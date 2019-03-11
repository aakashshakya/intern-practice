package calculator;

public class Calculation {


    private float firstVariable;
    private float secondVariable;

    public void setFirstVariable(float firstVariable) {
        this.firstVariable = firstVariable;
    }

    public void setSecondVariable(float secondVariable) {
        this.secondVariable = secondVariable;
    }

    float addition() {
        return firstVariable + secondVariable;
    }

    float subtraction() {
        return firstVariable - secondVariable;

    }

    float division() {

        return firstVariable / secondVariable;
    }



    float multiplication() {
        return firstVariable * secondVariable;
    }

}




