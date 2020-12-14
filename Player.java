package Head_First_java.Chapter1;

public class Player {
    int number =0;
    public void guess(){
        number = (int)(Math.random()*10);
        System.out.println("I'm guessing "+number);
    }
}
