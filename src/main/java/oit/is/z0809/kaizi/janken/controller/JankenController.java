package oit.is.z0809.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class JankenController {

  @GetMapping("/janken")
  public String janken(@RequestParam String input, ModelMap model) {
    String name = input;
    model.addAttribute("name2", name);
    // ModelMap型変数のmodelにname2という名前の変数で，nameの値を登録する．
    // ここで値を登録するとthymeleafが受け取り，htmlで処理することができるようになる
    return "janken.html";
  }

}
