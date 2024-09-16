package org.example.TreePrototypeMethod;

import java.util.ArrayList;
import java.util.List;

public class Trees implements Cloneable{

    private List<String> empList;

    public Trees(){
        empList = new ArrayList<String>();
    }

    public Trees(List<String> list) {
        this.empList=list;
    }

    public void loadData(){
        empList.add("Pine");
        empList.add("Redwood");
        empList.add("Beerch");
        empList.add("Evergreen");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for (String s : this.getEmpList()){
            temp.add(s);
        }
        return new Trees(temp);
    }
}
