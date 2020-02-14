public class Otter extends Animal{

    public Otter(){
        super("Water", "brown or grey", true, false);
    }

    public void pet(){
        System.out.println("Otters can also be kept as pets, although typically Asian Small-Claw Otters are kept. Summer wants one named Rico.");
    }

    public String toString(){

        String message = "";
        message += super.toString() + '\n';
        message += eat("fish.\n");
        message += speak("sCrEEEEEEEEE.");

        return message;

    }


}