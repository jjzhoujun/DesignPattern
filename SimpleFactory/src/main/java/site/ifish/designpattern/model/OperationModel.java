package site.ifish.designpattern.model;

public abstract class OperationModel {

    private float result = 0f;

    public abstract float getResult(float num1, float num2) throws Exception;

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}
