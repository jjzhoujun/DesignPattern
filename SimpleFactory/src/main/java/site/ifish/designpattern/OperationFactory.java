package site.ifish.designpattern;

import site.ifish.designpattern.model.*;

public class OperationFactory {

    public static OperationModel createOperation(final String opFlag) {
        OperationModel oper = null;
        switch (opFlag) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
            default:
                break;
        }
        return oper;
    }
}
