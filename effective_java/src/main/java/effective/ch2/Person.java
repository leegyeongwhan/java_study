package effective.ch2;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int birtYear;
    private List<String> kids;

    public Person(String name, int birtYear) {
        this.name = name;
        this.birtYear = birtYear;
        this.kids = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirtYear() {
        return birtYear;
    }

    public void setBirtYear(int birtYear) {
        this.birtYear = birtYear;
    }

    public List<String> getKids() {
        return kids;
    }

    public void setKids(List<String> kids) {
        this.kids = kids;
    }
}
