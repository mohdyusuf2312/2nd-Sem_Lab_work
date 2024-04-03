import java.util.Random;

// Custom exception class to store the iteration count
class IterationException extends Exception {
    private int iteration;

    public IterationException(String message, int iteration) {
        super(message);
        this.iteration = iteration;
    }

    public int getIteration() {
        return iteration;
    }
}

public class ExceptionHandling {
    // Method that may throw ArithmeticException at a random iteration
    public static void process() throws IterationException {
        Random random = new Random();
        int iterationToThrow = random.nextInt(10); // Randomly choose iteration to throw exception

        for (int i = 1; i <= 10; i++) {
            if (i == iterationToThrow) {
                throw new IterationException("ArithmeticException occurred at iteration " + i, i);
            }
            System.out.println("Iteration: " + i);
        }
    }

    public static void main(String[] args) {
        try {
            process();
        } catch (IterationException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Iteration when exception occurred: " + e.getIteration());
        }
    }
}
