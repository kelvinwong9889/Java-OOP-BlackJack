package playerInfo;

public class Player extends Person {

    private final String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    // hit
    // stand
}
