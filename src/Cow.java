public class Cow extends Animal{

    public Cow(){
        super("a farm", "white, white-black dots, or any brownish color", true, false);

    }


    public void runs(){
        System.out.println("This animal likes to laze around doing nothing but eat and moo.");
    }


    public String toString(){

        String message = "";
        message += super.toString() + '\n';
        message += eat("grass.\n");
        message += speak("moo.");

        return message;

    }

}

