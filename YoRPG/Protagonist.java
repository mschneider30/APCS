public class Protagonist {
public String name;
public int health;
public int damage;
public int taken;
public double damageM;
public double takenM;
public Protagonist (String g) {
health = 100;
name = g;
damage = 0;
}
public boolean isAlive () {
return (health > 0);
}
public int attack (Monster g) {
damage =  (int)(Math.random()*10*damageM);
taken = (int)(Math.random()*10*takenM);
g.health = g.health - damage;
return damage;
}
public void specialize () {
damageM = (2.5);
takenM = (2.5);
}
public void normalize () {
damageM = 1;
takenM = 1;
}
public String getName() {
return name;
}
}
