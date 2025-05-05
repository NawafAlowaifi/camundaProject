package com.nawaf.Controllers;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(){
    return "Hello World";
    }
    @RequestMapping(value = "/execute",method = RequestMethod.GET)
    public String execute(){
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
       ProcessInstantiationBuilder instance= processEngine.getRuntimeService().createProcessInstanceByKey("Process_012njgq");
       instance.setVariable("item", "Computer");
       instance.businessKey("execure-endpoint");
       instance.executeWithVariablesInReturn();
        return "executed";
    }
    @RequestMapping(value = "/tasks",method = RequestMethod.GET)
    public String tasks(){
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        ProcessInstantiationBuilder instance= processEngine.getRuntimeService().createProcessInstanceByKey("Process_012njgq");
//        instance.setVariable("item", "Computer");
//        instance.businessKey("execure-endpoint");
        instance.executeWithVariablesInReturn();
        return "executed";
    }



}
