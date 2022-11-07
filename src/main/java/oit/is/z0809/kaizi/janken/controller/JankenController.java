package oit.is.z0809.kaizi.janken.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import oit.is.z0809.kaizi.janken.model.Janken;
import oit.is.z0809.kaizi.janken.model.Entry;

@Controller
public class JankenController {

  @Autowired
  private Entry entry;
  @GetMapping("/janken")
  public String janken_get(ModelMap model, Principal prin) {
    String loginUser = prin.getName();
    this.entry.addUser(loginUser);
    model.addAttribute("entry", this.entry);
    return "janken.html";
  }

  @PostMapping("/janken")
  public String jankenpost(@RequestParam String name, ModelMap model) {
    model.addAttribute("Username", name);
    return "janken.html";
  }

  @GetMapping("/jankengame")
  public String jankengame(@RequestParam String hand, ModelMap model) {
    Janken janken = new Janken(hand);
    model.addAttribute("jaknen", janken);
    model.addAttribute("entry", this.entry);
    return "janken.html";
  }

}
