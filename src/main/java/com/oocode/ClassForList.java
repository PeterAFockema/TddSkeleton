package com.oocode;

import java.util.*;

public class ClassForList {

    private List<Integer> listToReturn;

    public ClassForList() {
        listToReturn = new ArrayList<>();
    }

    public List<Integer> ourList() {
        return listToReturn;
    }

    public void add(int i) {
        listToReturn.add(0, Integer.valueOf(i));
    }

    public Integer getLastValue() {
        return listToReturn.get(listToReturn.size()-1);
    }
}
