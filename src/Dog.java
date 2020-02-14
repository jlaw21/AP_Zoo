public class Dog extends Animal{

    public Dog(){
        super("Kennel", "blonde, black, white or brown", true, false);

    }


    public void runs(){
        System.out.println("This animal runs in circles chasing tail.");
    }


    public String toString(){

        String message = "";
        message += super.toString() + '\n';
        message += eat("chow.\n");
        message += speak("woof.");

        return message;

    }

}
