package hellomaven;

import asg.cliche.Shell;
import asg.cliche.ShellFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        HelloMavin comands =new HelloMavin();
        Shell shell = ShellFactory.createConsoleShell(
                "Hello",
                "HelloMaven",
                comands);
        shell.commandLoop();
    }
}
