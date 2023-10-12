package Hometask3;

public class StreamCorporator implements Comparable<StreamCorporator>{
    private String typeGroupe;
    private int studentNumber;

    public StreamCorporator(String typeGroupe, int studentNumber) {
        this.typeGroupe = typeGroupe;
        this.studentNumber = studentNumber;
    }

    @Override
    public int compareTo(StreamCorporator anotherPeople) {
        return Integer.compare(this.studentNumber, anotherPeople.studentNumber);
    }

    @Override
    public String toString() {
        return "StreamCorporator " +
                " typeGroupe " + typeGroupe + " " +
                " studentNumber=" + studentNumber +
                "\n" ;
    }


    public String toString1() {
        return "StreamCorporator " +
                "typeGroupe= " + typeGroupe + ' ' +
                " studentNumber " + studentNumber +
                ' ';
    }
}
