package site.ifish.designpattern.model;

public class OperationMul extends OperationModel {
    @Override
    public float getResult(float num1, float num2) {
        return num1 * num2;
    }
}