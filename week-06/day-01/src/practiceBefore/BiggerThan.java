package practiceBefore;

public class BiggerThan implements FancyCallable<Boolean, Integer> {
  int biggerThanWhat;

  public BiggerThan(Integer btw) {
    this.biggerThanWhat = btw;
  }

  public Boolean call0() {
    return true;
  }

  public Boolean call1(Integer n) {
    return n > biggerThanWhat;
  }

  public Boolean call2(Integer n1, Integer n2) {
    return n1 + n2 > 5;
  }
}
