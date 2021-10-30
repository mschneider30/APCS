public class countHi {
public int countHi(String str) {
  int count = 0;
  for (int i = 0;i < (str.length() -1);i+=1) {
    String letters = str.substring(i,i+2);
    if (letters.equals("hi")) {
      count++;
      i++;
    }
  }
  return count;
}
public static void main(String[] args) {
  System.out.println(countHi("abc hi ho"));
  System.out.println(countHi("ABChi hi"));
  System.out.println(countHi("hihi"));
}
}
