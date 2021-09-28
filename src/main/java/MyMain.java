public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int x = (int)(Math.random() * 6 + 1);
        return x;
    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        // REPLACE WITH YOUR CODE HERE

        // Your code should roll 6 dice 10,000 times, so you should have a
        // for loop such as:
        int counter = 0;
        int counter2 = 0;
        for (int i = 0; i < 10000; i++) {
            for ( int j = 0; j < 6; j++){
                if (rollDie() == 6){
                    counter += 1;
                }
                else {
                }
            }
            if (counter >= 1){
                counter2 += 1;
                counter = 0;
            }
            else{
            }
        }
        double x = counter2 / 100;
        return x;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int counter = 0;
        int counter2 = 0;
        for (int i = 0; i < 10000; i++) {
            for ( int j = 0; j < 12; j++){
                if (rollDie() == 6){
                    counter += 1;
                }
                else {
                }
            }
            if (counter >= 2){
                counter2 += 1;
            }
            counter = 0;
        }
        double x = counter2 / 100;
        return x;
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int counter = 0;
        int counter2 = 0;
        for (int i = 0; i < 10000; i++) {
            for ( int j = 0; j < 18; j++){
                if (rollDie() == 6){
                    counter += 1;
                }
                else {
                }
            }
            if (counter >= 3){
                counter2 += 1;
            }
            counter = 0;
        }
        double x = counter2 / 100;
        return x;
    }

    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
