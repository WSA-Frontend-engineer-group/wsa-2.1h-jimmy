public class Matching {

    private Individual me;

    private Individual candidate;

    private double point;


    public Matching(Individual me, Individual candidate, double point) {
        this.me = me;
        this.candidate = candidate;
        this.point = point;
    }


    public Individual getMe() {
        return me;
    }

    public Individual getCandidate() {
        return candidate;
    }

    public double getPoint() {
        return point;
    }
}
