package com.ptitsyn.alexey.my_web.controller;
import com.ptitsyn.alexey.my_web.Pc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping(value={ "/", "/Index" }, method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("pc", new Pc());
        return "Index";
    }

    @RequestMapping(value={ "/", "/Index" }, method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Pc pc, Model model) {
        model.addAttribute("pc", pc);
        return "Index";
    }

}