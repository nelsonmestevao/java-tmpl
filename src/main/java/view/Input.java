package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Input {
    private Input() {}

    public static void getEnter() {
        System.out.print(
                "\nPress" + Color.ANSI_PURPLE + " ENTER " + Color.ANSI_RESET + "to continue...");
        Input.getString();
    }

    public static int getOpcao(final int max) {
        int option;
        boolean ok = false;

        do {
            System.out.print("\t ⋙  ");
            option = Input.getInt();

            if (option >= 0 && option <= max) {
                ok = true;

            } else {
                Terminal.error("Invalid Option");
            }
        } while (!ok);

        return option;
    }

    public static String getString() {
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        String txt = "";
        while (!ok) {
            try {
                txt = input.nextLine();
                ok = true;
            } catch (InputMismatchException e) {
                Terminal.error(e.getMessage());
                System.out.print("New value: ");
                input.nextLine();
            }
        }
        input.close();
        return txt;
    }

    public static int getInt() {
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        int i = 0;
        while (!ok) {
            try {
                i = input.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                Terminal.error(e.getMessage());
                System.out.print("New value: ");
                input.nextLine();
            }
        }
        input.close();
        return i;
    }

    public static double getDouble() {
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        double d = 0.0;
        while (!ok) {
            try {
                d = input.nextDouble();
                ok = true;
            } catch (InputMismatchException e) {
                Terminal.error(e.getMessage());
                System.out.print("New value: ");
                input.nextLine();
            }
        }
        input.close();
        return d;
    }

    public static float getFloat() {
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        float f = 0.0f;
        while (!ok) {
            try {
                f = input.nextFloat();
                ok = true;
            } catch (InputMismatchException e) {
                Terminal.error(e.getMessage());
                System.out.print("New value: ");
                input.nextLine();
            }
        }
        input.close();
        return f;
    }

    public static boolean getBoolean() {
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        boolean b = false;
        while (!ok) {
            try {
                b = input.nextBoolean();
                ok = true;
            } catch (InputMismatchException e) {
                Terminal.error(e.getMessage());
                System.out.print("New value: ");
                input.nextLine();
            }
        }
        input.close();
        return b;
    }

    public static short getShort() {
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        short s = 0;
        while (!ok) {
            try {
                s = input.nextShort();
                ok = true;
            } catch (InputMismatchException e) {
                Terminal.error(e.getMessage());
                System.out.print("New value: ");
                input.nextLine();
            }
        }
        input.close();
        return s;
    }
}
