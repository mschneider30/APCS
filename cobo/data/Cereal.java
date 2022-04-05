public class Cereal {
  public String Name;
  public char Type;
  public int Calories;
  public int Protein;
  public int Fat;
  public int Sodium;
  public double Fiber;
  public double Carbohydrates;
  public int Sugar;
  public int Potassium;
  public int Vitamins;
  public int Shelf;
  public double Weight;
  public double Cups;
  public double Rating;

  public Cereal (String n, char t, int c, int p, int f, int s,
  double fi, double ca, int su, int po, int v, int sh, double w, double cu, double ra){
    Name = n;
    Type = t;
    Calories = c;
    Protein = p;
    Fat = f;
    Sodium = s;
    Fiber = fi;
    Carbohydrates = ca;
    Sugar = su;
    Potassium = po;
    Vitamins = v;
    Shelf = sh;
    Weight = w;
    Cups = cu;
    Rating = ra;

  }
public   String getName() {
  return Name;
}
public   char getType() {
  return Type;
}
public   int getCalories() {
  return Calories;
}
public   int getProtein() {
  return Protein;
}
public   int getFat() {
  return Fat;
}
public   int getSodium() {
  return Sodium;
}
public   double getFiber() {
  return Fiber;
}
public   double getCarbohydrates() {
  return Carbohydrates;
}
public   int getSuger() {
  return Sugar ;
}
public   int getPotassium() {
  return Potassium;
}
public   int getVitamins() {
  return Vitamins;
}
public   int getShelf() {
  return Shelf;
}
public   double getWeight() {
  return Weight;
}
public   double getCups() {
  return Cups;
}
public   double getRating() {
  return Rating;
}
public String toString() {
  System.out.println("Name: " + Name);
  System.out.println("Type: " + Type);
  System.out.println("Calories: " + Calories);
  System.out.println("Protein: " + Protein);
  System.out.println("Fat: " + Fat);
  System.out.println("Sodium: " + Sodium);
  System.out.println("Fiber: " + Fiber);
  System.out.println("Carbohydrates: " + Carbohydrates);
  System.out.println("Sugar: " + Sugar);
  System.out.println("Potassium: " + Potassium);
  System.out.println("Vitamins: " + Vitamins);
  System.out.println("Shelf: " + Shelf);
  System.out.println("Weight: " + Weight);
  System.out.println("Cups: " + Cups);
  System.out.println("Rating: " + Rating);
}
public static void main (String[] args) {
  Cereal Bran = new Cereal("100% Bran", 'C', 70, 4, 1, 130, 10, 5, 6, 280, 25, 3, 1, 0.33, 68.402973);
  System.out.println(Bran);
}

}
