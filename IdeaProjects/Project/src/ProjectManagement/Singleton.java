package ProjectManagement;

public class Singleton {
    // Configuration.java
    public static class Configuration {
        private static Configuration instance;
        private Configuration() {}
        public static synchronized Configuration getInstance() {
            if (instance == null) instance = new Configuration();
            return instance;
        }

        public String getSettings() {
            return "";
        }
        // config methods...
    }
    Configuration config = Configuration.getInstance();

}
