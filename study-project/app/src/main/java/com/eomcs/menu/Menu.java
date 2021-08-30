package com.eomcs.menu;

public abstract class Menu {

  String title;
  
  boolean enableAuth;

  public Menu(String title) {
    this.title = title;
  }
  
  public Menu(String title, boolean enableAuth) {
	  this(title); // 메뉴 이름 설정은 기존 생성자를 통해 처리한다.
	  this.enableAuth = enableAuth;
  }

  public abstract void execute();
}
