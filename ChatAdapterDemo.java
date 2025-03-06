import java.util.Scanner;

public class ChatAdapterDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LegacyChatService legacyChat = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyChat);

        while (true) {
            System.out.println("Enter a message to send (or type 'exit' to quit):");
            String message = scan.nextLine();

            if (message.equalsIgnoreCase("exit")) {
                break;
            }
            chatService.sendMessage(message);
        }
    }
}