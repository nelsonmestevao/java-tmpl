import controller.AppController;

public final class App {
    private App() {

    }

    public static void main(final String[] args) {
        new AppController().start();
    }
}
