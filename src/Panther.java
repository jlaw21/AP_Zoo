public class Panther extends Animal{
    public Panther(){
        super("Rainforest", "black", true, false);
    }
    public String toString(){
        String message="";
        message+=super.toString()+"\n";
        message+=eat("antelope, deer, boar, rabbit, birds, fish, reptiles, and insects.");
        message+=speak("chirp, peep, whistle, purr, moan, scream, growl, or hiss.");
        return message;
    }
}