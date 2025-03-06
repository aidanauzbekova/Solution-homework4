import java.util.Scanner;

public class ConfigManagerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        while (true) {
            System.out.println("Enter a configuration key (or type 'all' to print all, 'exit' to quit):");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("all")) {
                configManager.printAllConfigs();
            } else {
                System.out.println(input + " -> " + configManager.getConfig(input));
            }
        }
    }
}

