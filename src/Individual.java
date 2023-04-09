import java.util.Arrays;
import java.util.List;

public class Individual {

    private int id;
    private Gender gender;

    private int age;

    private String intro;

    private String habits;

    private  Coord coord;

    public Individual(int id, Gender gender, int age, String intro, String habits, Coord coord) {
        this.setId(id);
        this.setGender(gender);
        this.setAge(age);
        this.setIntro(intro);
        this.setHabits(habits);
        this.setCoord(coord);
    }

    public List<String> getHabits() {
        return Arrays.stream(this.habits.split(",")).toList();
    }

    public int getId() {
        return id;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id must greater than 0.");
        }
        this.id = id;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must greater than 200.");
        }
        this.age = age;
    }

    public void setIntro(String intro) {
        if (intro.length() > 200) {
            throw new IllegalArgumentException("Intro's length must less than 200.");
        }
        this.intro = intro;
    }

    public void setHabits(String habits) {
        if (Arrays.stream(habits.split(",")).toList().stream().allMatch(h -> h.trim().length() > 10)) {
            throw new IllegalArgumentException("Every habit's length must less than 10.");
        }

        this.habits = habits;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }
}
