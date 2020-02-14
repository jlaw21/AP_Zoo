public class Llama extends Animal {

    public Llama(){
        super("the mountains", "white, blonde, brown or black", true, false);
    }

    public String spit(String target){ return "This llama spit at " + target; }

    public String toString(){
        String message = "";

        message += super.toString() + "\n";
        message += eat("grasses");
        message += speak("hum");

        return message;
    }
}

