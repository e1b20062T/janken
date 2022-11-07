package oit.is.z0809.kaizi.janken.model;

import org.springframework.stereotype.Component;
import java.util.ArrayList;


@Component
public class Entry {
  ArrayList<String> users = new ArrayList<>();
  int count = 0;

  public void addUser(String name) {
    for (String n : this.users) {
      if (n.equals(name)) {
        return;
      }
    }
    this.users.add(name);
    count = users.size();
  }

  public void setUserCnt(int count) {
    this.count = count;
  }

  public int getUserCnt() {
    return count;
  }

  public ArrayList<String> getUsers() {
    return users;
  }

  public void setUsers(ArrayList<String> users) {
    this.users = users;
  }
}
