package oit.is.z0809.kaizi.janken.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import oit.is.z0809.kaizi.janken.model.janken;

@Controller
@RequestMapping("/janken")
public class JankenController {

  @GetMapping("/janken")
  public String janken() {
    return "janken.html";
  }

  /**
   *
   * @param model Thymeleafにわたすデータを保持するオブジェクト
   * @param prin  ログインユーザ情報が保持されるオブジェクト
   * @return
   */
  @GetMapping("step2")
  public String sample32(ModelMap model, Principal prin) {
    String loginUser = prin.getName(); // ログインユーザ情報
    model.addAttribute("login_user", loginUser);
    return "sample31.html";
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
