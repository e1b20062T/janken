package oit.is.z0809.kaizi.janken.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/janken")
public class JankenController {
  @GetMapping("step1")
  public String janken() {
    return "janken.html";
  }

  // @GetMapping("/janken")
  // public String jankenpost(@RequestParam String name, ModelMap model) {
  // model.addAttribute("name2", name);
  // return "janken.html";
  // }

  // @GetMapping("/jankengame")
  // public String jankengame(@RequestParam String hand, ModelMap model) {
  // String yourhand = hand;
  // String cpuhand = "Gu";
  // Janken janken = new Janken(yourhand, cpuhand);
  // model.addAttribute("yourhand", yourhand);

  //return "janken.html";
  // }

}
