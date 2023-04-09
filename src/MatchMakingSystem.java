import java.util.List;

public class MatchMakingSystem {

    private List<Individual> individuals;

    private MatchStrategy matchStrategy;

    private ChooseStrategy chooseStrategy;

    public MatchMakingSystem(List<Individual> individuals, MatchStrategy matchStrategy, ChooseStrategy chooseStrategy) {
        this.individuals = individuals;
        this.matchStrategy = matchStrategy;
        this.chooseStrategy = chooseStrategy;
    }

    public void matchMaking() {
        for (Individual individual : individuals) {
            List<Matching> result = matchStrategy.match(individual, individuals.stream().filter(i -> i.getId() != individual.getId()).toList());
            Matching matchResult = chooseStrategy.choose(result);
            System.out.printf("%d => %d(score is %f) \n", matchResult.getMe().getId(), matchResult.getCandidate().getId(), matchResult.getPoint());
        }
    }
}
