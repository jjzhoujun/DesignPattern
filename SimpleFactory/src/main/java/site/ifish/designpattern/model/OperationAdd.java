package site.ifish.designpattern.model;

public class OperationAdd extends OperaModel {

    @Override
    public float getResult(float num1, float num2) {
        return num1 + num2;
    }
}
