public class HumanTest {
    public static void main(String[] args) {
    Human human1 = new Human();
    Human human2 = new Human();
    human1.displayHealth();
    human2.displayHealth();
    human1.attack(human2);
    human2.attack(human1);
    human2.attack(human1);
    human1.displayHealth();
    human2.displayHealth();
    }
    
}