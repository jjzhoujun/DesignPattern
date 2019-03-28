package site.ifish.designpattern;

import site.ifish.designpattern.model.*;

public class OperationFactory {

    public static OperaModel createOperation(final String opFlag) {
        OperaModel oper = null;
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
