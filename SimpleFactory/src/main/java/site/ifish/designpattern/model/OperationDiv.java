package site.ifish.designpattern.model;

public class OperationDiv extends OperationModel {
    @Override
    public float getResult(float num1, float num2) throws Exception{
        if(num2 == 0) {
            throw new Exception("除数不能为0");
        }
        return num1 / num2;
    }
}
