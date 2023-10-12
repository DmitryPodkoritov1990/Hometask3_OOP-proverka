package Hometask3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StreamCorporator>{
private int streamNumber;

private List<StreamCorporator> groups;

    public Stream(int streamNumber) {
        this.streamNumber = streamNumber;
        this.groups = new ArrayList<>();
    }

    public void addGroupe(StreamCorporator groups){
        this.groups.add(groups);
    }


    public int getStreamNumber() {
        return streamNumber;
    }

    public void setStreamNumber(int streamNumber) {
        this.streamNumber = streamNumber;
    }

    public List<StreamCorporator> getGroups() {
        return groups;
    }

    public void setGroups(List<StreamCorporator> groups) {
        this.groups = groups;
    }

    public Iterator<StreamCorporator> iterator(){
        return groups.iterator();
    }
}
