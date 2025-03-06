class LegacyChatService {
    public void sendLegacyMessage(String msg) {
        System.out.println("Legacy Chat: " + msg);
    }
}

interface ChatService {
    void sendMessage(String message);
}

class ChatServiceAdapter implements ChatService {
    private LegacyChatService legacyChatService;

    public ChatServiceAdapter(LegacyChatService legacyChatService) {
        this.legacyChatService = legacyChatService;
    }

    @Override
    public void sendMessage(String message) {
        legacyChatService.sendLegacyMessage(message);
    }
}

