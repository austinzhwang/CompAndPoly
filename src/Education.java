import java.util.ArrayList;

public class Education {

    private ArrayList<String> lastTenSchools;

    public Education() {
        lastTenSchools = new ArrayList<>();
    }

    public void addSchool(String school) {
        lastTenSchools.add(school);
    }

    public String toString() {
        String s = "";
        for (String key : lastTenSchools) {
            s += key + " ";
        }
        return s;
    }

}
