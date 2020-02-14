public class Cheetah extends Animal{

    public Cheetah(){
        super("grasslands", "Tan with black spots", true ,false);
    }

    public void run(){
        System.out.println("This animal runs very fast.");
    }
    public String toString() {
    String message = "";
    message += super.toString() + '\n';
    message += eat("meat. \n");
    message += speak("MEOW! \n");

    return message;
    }

}
