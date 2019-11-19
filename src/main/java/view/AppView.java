package view;

import util.Parse;

import java.util.List;

public final class AppView {
    private static final String LOGO_PATH = "img/logo.ascii";

    public void show(final List<String> text) {
        for (String line : text) {
            System.out.println(line);
        }
    }

    public static void showLogo() {
        List<String> logo = Parse.read(LOGO_PATH);

        for (String line : logo) {
            System.out.println("   " + line + "   ");
        }
    }
}
