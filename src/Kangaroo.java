public class Kangaroo extends Animal{

    public Kangaroo(){
        super("wooded forests, savannahs, scrublands, deserts, and grassy plains", "grey, and red", true, false);
    }

    public String toString(){

        String message = "";
        message += super.toString() + '\n';
        message += eat("grass.\n");
        message += speak("growls or barks.");

        return message;

    }

}
