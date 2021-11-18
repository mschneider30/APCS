public class Monster {
public int health;
public Monster () {
health = 50;
}
public boolean isAlive (){
return (health > 0);
}
public int attack (Protagonist g){
return g.taken;
}
}

