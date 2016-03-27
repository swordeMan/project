package com.warehouse.web.action;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.warehouse.web.form.PersonForm;

@Controller
public class ValidateTestAction extends WebMvcConfigurerAdapter {
	
	@RequestMapping(value="results")
    public void results(PersonForm personForm,Model model) {
//        ����ֵΪvoid�����ֱ�ӷ���requestMapping�е�ֵ��Ϊview·��
    }

    @RequestMapping(value="validate", method=RequestMethod.GET)
    public String showForm(PersonForm personForm,Model model) {
        return "index";
//        return "share/header";
    }

    @RequestMapping(value="validate", method=RequestMethod.POST)
    public String checkPersonInfo(@Valid PersonForm personForm,BindingResult bindingResult,Model model) {

        if (bindingResult.hasErrors()) {
            return "index";
        }
//      ʹ��redirct:/��ת����һ��action
        return "forward:/results";//�����ض���web-info������ļ�
    }
	
	
}
