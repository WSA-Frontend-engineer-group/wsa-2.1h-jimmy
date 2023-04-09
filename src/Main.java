import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Individual> individuals = Arrays.asList(
                new Individual(1, Gender.MALE, 31,  "FE engineer", "Coding, baseball", new Coord(0, 0)),
                new Individual(2, Gender.FEMALE, 33,  "FE engineer", "Coding, READING", new Coord(300, 400)),
                new Individual(3, Gender.FEMALE, 99,  "None", "Swimming", new Coord(1000, 1000))
        );
        MatchMakingSystem matchMakingSystem = new MatchMakingSystem(individuals, new HabitBaseMatchStrategy(), new LastOneChooseStrategy());
        matchMakingSystem.matchMaking();
    }
}