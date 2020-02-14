public class Lion extends Animal {
    public Lion(){
        super("Grassy plains","Tan and sometimes white",true,false);
    }

    public String toString(){
        String message = "";
        message += super.toString() + '\n';
        message += eat("meat.\n");
        message += speak("roar.");

        return message;
    }
}
