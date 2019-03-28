package site.ifish.designpattern.model;

public class OperaModel {
    private float num1;
    private float num2;
    private String opFlag;

    /**
     * 需要重写
     * */
    public float getResult(float num1, float num2) throws Exception {
        return 0.0f;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public String getOpFlag() {
        return opFlag;
    }

    public void setOpFlag(String opFlag) {
        this.opFlag = opFlag;
    }

    @Override
    public String toString() {
        return "num1 = " + num1 + "; num2 = " + num2 + "; opFlag = " + opFlag;
    }
}
