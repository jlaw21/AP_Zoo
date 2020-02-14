public class Wolf extends Animal {

    public Wolf(){
    super("Den", "Grey", true, false);
    }

    public void runs(){System.out.println("This animal runs in packs.");}

    public String toString(){
        String message = "";
        message += super.toString() + "\n";
        message += eat("Flesh.\n");
        message += speak("Howls.\n");
        message += "Man's TRUE best friend.\n";
        message += "This animal is better than the rest.\n";



        return message;
    }




}
