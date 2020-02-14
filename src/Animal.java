public class Animal {

    private String livingQuarters, coatColor;
    private boolean liveBirths, laysEggs;

    public Animal(){


    }

    public Animal(String quarters, String coat, Boolean birth, Boolean eggs){

        livingQuarters = quarters;
        coatColor = coat;
        liveBirths = birth;
        laysEggs = eggs;

    }

    public String eat(String food){
        return "This animal eats " + food;
    }

    public String speak(String sound){
        return "This animal says " + sound;
    }

    public String toString(){
        String message = "";
        message += "This animal lives in " + livingQuarters;
        message += "\nThis animal's color is generally " + coatColor;
        if(liveBirths)
            message += "\nThis animal has live births";
        if(laysEggs)
            message += "\nThis animal lays eggs";

         return message;

    }

}
