package Cow;

public class Cowsay {
  public static void main(String[] args){
    String message = "U little hoe!";
    if(args.length > 0){
        message = args[0];
    }

    System.out.println(" ,,,,,,,,,,,,,");
    System.out.println("( " + message + " )");
    System.out.println(" '''''''\\  /''^__^");
    System.out.println("         \\_\\  (oo)\\________");
    System.out.println("             >(__)\\        )\\/\\");
    System.out.println("                ||-----w |");
    System.out.println("                ||      ||");
}
}