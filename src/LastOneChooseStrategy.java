import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LastOneChooseStrategy implements ChooseStrategy{
    @Override
    public Matching choose(List<Matching> result) {
        Collections.sort(result, Comparator.<Matching, Double>comparing(matchRate -> matchRate.getPoint()));
        return result.get(0);
    }
}
