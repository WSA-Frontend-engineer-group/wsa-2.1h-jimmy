import java.util.ArrayList;
import java.util.List;

public class DistanceBaseMatchStrategy implements MatchStrategy {
    @Override
    public List<Matching> match(Individual individual, List<Individual> candidates) {
        List<Matching> result = new ArrayList<>();
        for (Individual candidate : candidates) {
            double distance = Math.pow(Math.pow(candidate.getCoord().getY() - individual.getCoord().getY(), 2) + Math.pow(candidate.getCoord().getY() - individual.getCoord().getY(), 2), 0.5);
            result.add(new Matching(individual, candidate, distance));
        }
        return result;
    }
}
