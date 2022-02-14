public class Triangle {
  public int triangle (int rows) {
    if (rows == 0) {
      return 0;
    }
    return rows + rows(rows-1);
  }
  public static void main(String[] args) {

  }
}
