package fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FizzBuzzMain {

    private final org.slf4j.Logger logger;

    public FizzBuzzMain(Logger logger) {

        this.logger = logger;
    }

    public static void main(String[] args) {
        FizzBuzzMain fizzBuzzMain = new FizzBuzzMain(LoggerFactory.getLogger(FizzBuzzMain.class));
        fizzBuzzMain.run();
    }

    void run() {
        logger.info("test");
    }
}
