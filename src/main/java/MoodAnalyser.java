public class MoodAnalyser {

    String message;

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String happyMood = moodAnalyser.analyseMood();
        System.out.println("My mood is :" + happyMood);
        String sadMood = moodAnalyser.analyseMood();
        System.out.println("My Mood is :" + sadMood);
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
    }

    public String analyseMood() {
        if (message.toLowerCase().contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}