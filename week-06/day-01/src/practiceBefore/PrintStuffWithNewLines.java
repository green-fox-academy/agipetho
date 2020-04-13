package practiceBefore;

public class PrintStuffWithNewLines implements FancyCallable<Boolean,Integer> {
  public Boolean call0()
  {
    return true;
  }
  public Boolean call1(Integer n)
  {
    System.out.println(n);
    return true;
  }
  public Boolean call2(Integer n1, Integer n2)
  {
    return true;
  }
}
