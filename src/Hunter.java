import java.time.LocalDate;

public class Hunter {

    private String name;
    private HunterRank rankLevel;

    public Hunter(String name, HunterRank rankLevel) {
        if (name.equalsIgnoreCase("Saitama")) {
            throw new RuntimeException("You picked the wrong anime, go Jinwoo");
        }

        this.name = name;
        this.rankLevel = rankLevel;
    }

    @Override
    public String toString() {
        return "Hunter{" +
                "name='" + name + '\'' +
                ", rankLevel=" + rankLevel +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HunterRank getRankLevel() {
        return rankLevel;
    }

    public void setRankLevel(HunterRank rankLevel) {
        this.rankLevel = rankLevel;
    }
}
