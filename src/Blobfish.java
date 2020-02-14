public class Blobfish extends Animal{

    public Blobfish(){
        super("deep sea", "grey", false, true);

    }


    public void swims(){
        System.out.println("This animal swims in circles, vibrating its gelatinous figure");
    }


    public String toString(){

        String message = "";
        message += super.toString() + '\n';
        message += eat("crabs.\n");
        message += speak("blub.");

        return message;

    }
}
