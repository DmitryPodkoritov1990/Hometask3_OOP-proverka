package Hometask3;

public class PeopleStudy {
    protected String name;
    protected int numberGroupe;
    protected int yearStudy;

    public PeopleStudy(String name, int numberGroupe, int yearStudy) {
        this.name = name;
        this.numberGroupe = numberGroupe;
        this.yearStudy = yearStudy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberGroupe() {
        return numberGroupe;
    }

    public void setNumberGroupe(int numberGroupe) {
        this.numberGroupe = numberGroupe;
    }

    public int getYearStudy() {
        return yearStudy;
    }

    public void setYearStudy(int yearStudy) {
        this.yearStudy = yearStudy;
    }

    @Override
    public String toString() {
        return "PeopleStudy{" +
                "name='" + name + '\'' +
                ", numberGroupe=" + numberGroupe +
                ", yearStudy=" + yearStudy +
                '}';
    }
}
