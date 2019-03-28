package site.ifish.designpattern.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import site.ifish.designpattern.OperationFactory;
import site.ifish.designpattern.model.ParamsModel;
import site.ifish.designpattern.model.OperationModel;

@Slf4j
@Controller
public class OperationController {

    @PostMapping("/operation")
    public String calResult(@ModelAttribute ParamsModel paramsModel, Model model) {
        log.info("paramsModel = " + paramsModel.toString());
        String opFlag = paramsModel.getOpFlag();
        OperationModel opModel = OperationFactory.createOperation(opFlag);
        try {
            float result = opModel.getResult(paramsModel.getNum1(), paramsModel.getNum2());
            opModel.setResult(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("OperationModel", opModel);
        return "result";
    }

    @GetMapping("/operation")
    public String calGet(Model model) {
        log.info("===>>>>calGet....");
        model.addAttribute("ParamsModel", new ParamsModel());
        return "operation";
    }

}
