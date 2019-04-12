public class SingletonTwist {
  public static void main(String[] args) {
    
    Jeep j01 = Jeep.getInstance("2wd");
    Jeep j02 = Jeep.getInstance("4wd");
    System.out.println("first = " + j01.shift + ", second = " + j02.shift);
  }  
}

class Jeep {
  String shift; //2wd, 4wd
  private static Jeep jeepInstanceFirst = null;
  private static Jeep jeepInstanceSecond = null;
  static int instanceIndex = 0;

  private Jeep(String shiftType) {
    this.shift = shiftType;
  }

  public static Jeep getInstance(String shift) {
    if (jeepInstanceFirst == null) jeepInstanceFirst = new Jeep(shift);
    if (jeepInstanceSecond == null) jeepInstanceSecond = new Jeep(shift);
    Jeep instance = instanceIndex == 0 ? jeepInstanceFirst : jeepInstanceSecond; 
    return instance;
  }
}
