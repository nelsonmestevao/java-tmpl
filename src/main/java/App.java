import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import util.Parser;

public final class App {
    private static Logger log = LogManager.getLogger(App.class);

    private App() {
    }

    public static void main(final String[] args) {
        new App().start();
    }

    public void start() {
        log.info("Application started successfully");
        Parser.readFile("target/classes" + "/art/logo.ascii").stream().forEach(System.out::println);
    }
}
