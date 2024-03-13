package day7.chap6;

public class Circle{

  static void staticMethod() {
    System.out.println("static method입니다.");
  }

  final void finalMethod(){
    System.out.println("final method입니다.");
  }

  private void secret() {
    System.out.println("비밀입니다.");
  }
  protected void findRadius() {
    System.out.println("반지름이 10입니다.");
  }

  void exceptionMethod() throws NullPointerException {

  }

  public void findArea() {
    System.out.println("넓이는 3.14*반지름*반지름 입니다.");
  }
}
