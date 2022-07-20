package fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class FizzBuzzMainIT {

    @Mock
    Logger logger;

    @Test
    void logFizzBuzzNumbers() {
        FizzBuzzMain fizzBuzzMain = new FizzBuzzMain(logger);
        fizzBuzzMain.run();
        verify(logger).info("test");
    }
}
