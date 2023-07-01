package FlightControl;

import java.util.Scanner;
import FlightControl.logic.FlightControl;
import FlightControl.ui.ui;
public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        FlightControl testFC = new FlightControl();
        Scanner sc = new Scanner(System.in);
                
                ui ui = new ui(testFC, sc);
                
                ui.start();
    }
}
