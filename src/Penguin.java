public class Penguin extends Animal{
    boolean canFly;
    public Penguin(){
        super ("nests", "black and white", false, true);
    }

    public String toString(){
        String message = "";
        message += super.toString() + '\n';
        message += eat("fish.\n");
        message += speak("ecstatic display songs.");

        return message;
    }

}
