package humanemployeeexercise;

public class Unicorn {
    private static Unicorn unicorn;

    private Unicorn(){
    }

    public static Unicorn getUnicorn(){
        if(unicorn == null){
            unicorn = new Unicorn();
        } return unicorn;
    }
}
