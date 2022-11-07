package oit.is.z0809.kaizi.janken.model;

import java.util.Random;

public class Janken {

  String hand;
  String cpuhand;

  public Janken(String hand) {

    this.hand = hand;
    this.cpuhand = randcpuhand();

  }

  public String battle() {

    if (this.hand.equals(this.cpuhand)) {
      return "Draw";
    }

    if (this.hand.equals("Gu")) {
      if (this.cpuhand.equals("Tyoki")) {
        return "You Win!";
      }
      if (this.cpuhand.equals("Pa")) {
        return "You Lose";
      }
    }

    if (this.hand.equals("Tyoki")) {
      if (this.cpuhand.equals("Pa")) {
        return "You Win!";
      }
      if (this.cpuhand.equals("Gu")) {
        return "You Lose";
      }
    }

    if (this.hand.equals("Pa")) {
      if (this.cpuhand.equals("Gu")) {
        return "You Win!";
      }
      if (this.cpuhand.equals("Tyoki")) {
        return "You Lose";
      }
    }

    return "";

  }

  public String randcpuhand() {

    Random random = new Random();
    int value = random.nextInt(3);

    if (value == 0) {
      return "Gu";
    }
    if (value == 1) {
      return "Tyoki";
    }
    if (value == 2) {
      return "Pa";
    }
    return "";
  }

  public void sethand(String hand) {
    this.hand = hand;
  }

  public String gethand() {
    return this.hand;
  }

  public void setcpuhand(String hand) {
    this.cpuhand = hand;
  }

  public String getcpuhand() {
    return this.cpuhand;
  }

}
