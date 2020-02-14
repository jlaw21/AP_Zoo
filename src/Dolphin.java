public class Dolphin extends Animal{
    public Dolphin(){
        super("Ocean", "Gray", true, false);
    }

    public String toString(){
        String message = "";
        message += toString();
        message += eat("fish.\n");
        message += speak("squeak.");

        return message
    }
}
