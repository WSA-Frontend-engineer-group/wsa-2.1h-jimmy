import java.util.ArrayList;
import java.util.List;

public class HabitBaseMatchStrategy implements MatchStrategy{
    @Override
    public List<Matching> match(Individual individual, List<Individual> candidates) {
        List<Matching> result = new ArrayList<>();
        for (Individual candidate : candidates) {
            Double duplicateCount = Double.valueOf(candidate.getHabits().stream().distinct().filter(individual.getHabits()::contains).toList().size());
            result.add(new Matching(individual, candidate, duplicateCount));
        }
        return result;
    }
}
