package Hometask3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PeopleGroupeIterator implements Iterator<StreamCorporator> {
    private List<StreamCorporator> spisokGroupe;
    private List<PeopleStudy> peopleStudies = new ArrayList<>();

    private int count;

    public PeopleGroupeIterator(List<StreamCorporator> spisokGroupe) {
        this.spisokGroupe = spisokGroupe;
        this.count = 0;

    }

    @Override
    public boolean hasNext() {
        return count < spisokGroupe.size();
    }



    public List<PeopleStudy> getPeopleStudies() {
        return peopleStudies;
    }

    public int getCount() {
        return count;
    }

    @Override
    public StreamCorporator next() {
        if (!hasNext())
        {
            return null;
        }
        return spisokGroupe.get(count++);


    }
    public StreamCorporator getGroupe(int count){
        return spisokGroupe.get(count);
    }
//
//    public int getCount() {
//        return count;
//    }
}


