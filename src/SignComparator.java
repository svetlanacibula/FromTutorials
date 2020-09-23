public class SignComparator {
    public String compare (int number) {
        if (number > 0) {
            return "positive";
        }
        else if (number < 0) {
            return "negative";
        }

        else {
            return "equal to zero";
        }
    }
}
