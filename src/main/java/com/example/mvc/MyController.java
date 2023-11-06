package com.example.mvc;

import com.example.mvc.dao.AffairRepository;
import com.example.mvc.entity.Affair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private AffairRepository affairRepository;

    @RequestMapping("/")
    public String showAllAffairs(Model model) {

        List<Affair> list = affairRepository.getAll();
        model.addAttribute("AllAff", list);
        return "AllAffairs";
    }

    @RequestMapping("/add")
    public String addAffairs(Model model) {
        Affair qwer = new Affair();
        model.addAttribute("Afaf", qwer);
        return "AddForm";
    }

    @RequestMapping("/save")
    public String saveAffair(@ModelAttribute("Afaf") Affair affair) {
        affairRepository.save(affair);
        return "redirect:/";
    }

    @RequestMapping("/update")
    public String updateAffair(@RequestParam("AffId") Integer id, Model model) {
        Affair asdf = affairRepository.findById(id);
        model.addAttribute("Afaf", asdf);
        return "AddForm";
    }

    @RequestMapping("/delete")
    public String deleteAffair(@RequestParam("AffId") Integer id) {
        affairRepository.delete(id);
        return "redirect:/";
    }


}
