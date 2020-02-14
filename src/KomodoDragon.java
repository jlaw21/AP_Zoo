public class KomodoDragon extends Animal{

    public KomodoDragon(){
        super("Islands", "grey or brown.", false, true);
    }

    public void Saliva(){
        System.out.println("This animal has a venomous bite.");
    }

    public String toString(){
        String message = " ";

        message += super.toString() + '\n';
        message += eat("Water Buffalo");
        message += speak("H I S S");

        return message;
    }

}
