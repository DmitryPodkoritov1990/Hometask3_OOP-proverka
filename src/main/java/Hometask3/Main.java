package Hometask3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Stream stream = new Stream(5);
    StreamCorporator studyGroupe1 = new StreamCorporator("ingeneers", 6);
    StreamCorporator studyGroupe2 = new StreamCorporator("agronomy", 8);
    StreamCorporator studyGroupe3 = new StreamCorporator("lawers", 7);
    StreamCorporator studyGroupe4 = new StreamCorporator("counters", 10);
        List<StreamCorporator> spisokGroupe = new ArrayList<>(List.of(studyGroupe1, studyGroupe2, studyGroupe3, studyGroupe4));
        PeopleGroupeIterator peopleGroupeIterator = new PeopleGroupeIterator(spisokGroupe);
        System.out.println(peopleGroupeIterator.toString());


        while (peopleGroupeIterator.hasNext()){
            System.out.println(peopleGroupeIterator.getGroupe(peopleGroupeIterator.getCount()).toString1());
            peopleGroupeIterator.next();

            Collections.sort(spisokGroupe);
            System.out.println(spisokGroupe.toString());


        }
    }


}
