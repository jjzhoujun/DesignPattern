package site.ifish.designpattern.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import site.ifish.designpattern.OperationFactory;
import site.ifish.designpattern.model.OperaModel;
import site.ifish.designpattern.model.ResultModel;

@Slf4j
@Controller
public class OperationController {

    @PostMapping("/operation")
    public String calResult(@ModelAttribute OperaModel operaModel, Model model) {
        log.info("operaModel = " + operaModel.toString());
        String opFlag = operaModel.getOpFlag();
        OperaModel opModel = OperationFactory.createOperation(opFlag);
        ResultModel resultModel = new ResultModel();
        try {
            float result = opModel.getResult(operaModel.getNum1(), operaModel.getNum2());
            resultModel.setResult(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("ResultModel", resultModel);
        return "result";
    }

    @GetMapping("/operation")
    public String calGet(Model model) {
        log.info("===>>>>calGet....");
        model.addAttribute("OperaModel", new OperaModel());
        return "operation";
    }

}
