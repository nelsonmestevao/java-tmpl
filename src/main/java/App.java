import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import util.Parser;

public final class App {
    private static Logger log = LogManager.getLogger(App.class);

    private static final String PROGRAM_NAME = "java-tmpl";

    @Parameter(
            names = {"-h", "--help"},
            help = true,
            description = "Displays help information")
    private boolean help = false;

    @Parameter(
            names = {"-a", "--address", "--hostname"},
            description = "Hostname address")
    private String address =
            Optional.ofNullable(System.getenv("APP_SERVER_HOSTNAME")).orElse("127.0.0.1");

    @Parameter(
            names = {"-p", "--port"},
            description = "Port number")
    private int port =
            Integer.parseInt(Optional.ofNullable(System.getenv("APP_SERVER_PORT")).orElse("8080"));

    @Parameter(
            names = {"-l", "--length"},
            required = true)
    private int length;

    @Parameter(
            names = {"-u", "--users"},
            variableArity = true,
            description = "List of users whose home directories will be archived as per profile.")
    private List<String> users = new ArrayList<>();

    private App() {}

    public static void main(final String[] args) {
        new App().start(args);
    }

    public void start(final String[] args) {
        this.parseArguments(args);

        log.info("Application started successfully");
        Parser.readFile("target/classes" + "/art/logo.ascii").stream().forEach(System.out::println);

        System.out.println("hostname: " + this.address);
        System.out.println("port: " + this.port);
        System.out.println("length: " + this.length);
        System.out.println("users: " + this.users);
    }

    public void parseArguments(final String[] args) {
        JCommander commands = new JCommander(this);
        commands.setProgramName(PROGRAM_NAME);

        try {
            commands.parse(args);
        } catch (ParameterException exception) {
            System.err.println(exception.getMessage());
            commands.usage();
            System.exit(1);
        }

        if (this.help) {
            commands.usage();
            System.exit(0);
        }
    }
}
