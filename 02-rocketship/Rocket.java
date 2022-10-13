
/**
 * Write a description of class Rocket here.
 *
 * @author (Hamid)
 * @version (9/22/22)
 */
class Rocket {
public static void main(String[] args) {
line();
plus();
straight();
plus2();
straight2();
plus3( );
straight3();
plus4();
line1();
  
}
public static void line() {
System.out.println("             /\\");
System.out.println("            /  \\");
System.out.println("           /    \\");
}
public static void plus() {
 System.out.println("          +------+"); 
}
public static void straight() {
 System.out.println("         |        |");
 System.out.println("         |        |");
}
public static void plus2() {
    plus();
  }
public static void straight2() {
    System.out.println("          |United|");
    System.out.println("          |States|");
}
public static void plus3() {
    plus();
}
public static void straight3() {
  straight();
}
public static void plus4() {
  plus();
}
public static void line1() {
  line();
 }
}