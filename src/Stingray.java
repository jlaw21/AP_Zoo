public class Stingray extends Animal {

    public Stingray(){
        super ("ocean.","gray, black, or white.",false,true);
    }

    public String toString(){
        String message="";
        message+=super.toString();
        message+=eat("fish.");
        message+=speak("fish noise.");
        return message;
    }

}
