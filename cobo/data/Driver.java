import core.data.*;

public class Driver {
   public static void main(String[] args) {
      String id1 = "peace-cable";
      DataSource ds1 = DataSource.connect("https://www.submarinecablemap.com/submarine-cable/" + id1);
      ds1.setCacheTimeout(15 * 60);
      ds1.load();
      //ds1.printUsageString();
      float temp = ds.fetchFloat("temp_f");
      String loc = ds.fetchString("location");
      System.out.println("The temperature at " + loc + " is " + temp + "F");


   }
}
