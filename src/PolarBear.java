public class PolarBear extends Animal {

    public PolarBear(){
        super("Cave","White",true,false);
    }
    public void Stand(){
        System.out.println("This Animal Can Stand on two legs to show dominance.");
    }
    public String toString(){
        String message="";
        message+=super.toString() + '\n';
        message+= eat("Seal");
        message+= speak("Throaty rumbling");
        return message;

    }
}
