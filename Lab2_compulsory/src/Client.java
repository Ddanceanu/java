public class Client {
    private String name;
    private ClientType type;
    private String timeInterval;

    public Client(String name, ClientType type, String timeInterval) {
        this.name = name;
        this.type = type;
        this.timeInterval = timeInterval;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientType getType() {
        return type;
    }

    public void setType(ClientType type) {
        this.type = type;
    }

    public String getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", timeInterval='" + timeInterval + '\'' +
                '}';

    }
}
