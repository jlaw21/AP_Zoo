public class ArcticFox extends Animal {
    public ArcticFox(){
        super("Den", "White or White with black spots", true,false );
    }
    public void colorChange(){
        System.out.println("An Arctic foxes coat can change color based on the temperature of its surroundings.");
    }

    public String toString(){

        String message = "";
        message += super.toString() + '\n';
        message += eat(" voles, other rodents, hares, birds, eggs, fish, and carrion.\n");
        message += speak("squeak.");

        return message;

    }
}
