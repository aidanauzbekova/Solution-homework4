import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> configData;

    private ConfigurationManager() {
        configData = new HashMap<>();
        loadConfigurations();
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    private void loadConfigurations() {
        configData.put("maxPlayers", "100");
        configData.put("defaultLanguage", "en");
        configData.put("gameDifficulty", "medium");
    }

    public String getConfig(String key) {
        return configData.getOrDefault(key, "Not Found");
    }

    public void printAllConfigs() {
        System.out.println("Configuration Settings:");
        configData.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
