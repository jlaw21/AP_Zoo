public class Shark extends Animal {
    public Shark() {
        super("Ocean", "white, black, gray", false, true);
    }



        public String toString() {
            String message = "";
            message += super.toString() + '\n';
            message += eat("fish");
            message += speak("Some noise");

            return message;
        }

    }

