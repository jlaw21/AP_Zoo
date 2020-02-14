public class Coyote extends Animal {


    public Coyote(){
        super("Kennel", "blonde, black, white, gray, or brown", true, false);

    }


    public void runs(){
        System.out.println("This animal walks around scavenging for food.");
    }


    public String toString(){

        String message = "";
        message += super.toString() + '\n';
        message += eat("rodents.\n");
        message += speak("howl.");

        return message;

    }

}
//

