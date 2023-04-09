import java.util.List;

public interface MatchStrategy {
    public abstract List<Matching> match(Individual individual, List<Individual> candidates);
}
