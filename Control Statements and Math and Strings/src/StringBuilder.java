//Use StringBuilder  -> good performance
//                   -> Not thread-safe



public class StringBuilder {
    public static void main(String[] args) {
          java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello my first num is ");
          sb.append(45);
          sb.append(" and my second num is ");
          sb.append(54);
          System.out.println(sb);
    }
}
