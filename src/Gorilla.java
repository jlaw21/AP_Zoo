public class Gorilla extends Animal {

    public Gorilla(){
        super("Jungle","black,white", true, false);
    }


    public String toString() {
        String message="";

        message += super.toString() + '\n';
        message += eat("BANANA \n");
        message += speak("ooh ahh");

       return message;
    }
}
