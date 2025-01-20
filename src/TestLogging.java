import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestLogging {
	public static final Logger logger = Logger.getLogger(TestLogging.class.getName());

	public static void main(String[] args) throws SecurityException, IOException {
		FileHandler handler = new FileHandler("application.log", true);
		handler.setFormatter(new SimpleFormatter());
		logger.addHandler(handler);
		logger.log(Level.INFO, "Inside TestLogging main method");

	}
}
