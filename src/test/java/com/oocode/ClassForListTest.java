package com.oocode;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ClassForListTest {
    @Test
    public void testEmptyListIsThereWhenClassIsInitialised() {
        List<Integer> testList = new ArrayList<Integer>();
        assertThat(new ClassForList().ourList(), equalTo(testList));
    }

    @Test
    public void testAddingIntThingsToList() {
        List<Integer> testList = new ArrayList<Integer>();
        testList.add(1);
        ClassForList assertList = new ClassForList();
        assertList.add(1);
        assertThat(assertList.ourList(), equalTo(testList));
    }

    @Test
    public void testAddingIntegerThingsToList() {
        List<Integer> testList = new ArrayList<Integer>();
        testList.add(Integer.valueOf(1));
        ClassForList assertList = new ClassForList();
        assertList.add(Integer.valueOf(1));
        assertThat(assertList.ourList(), equalTo(testList));
    }

    @Test
    public void testRetrievingValueFromList() {
        ClassForList classForList = new ClassForList();
        classForList.add(1);
        assertThat(classForList.getLastValue(), equalTo(Integer.valueOf(1)));
    }

    @Test
    public void testMostRecentItemIsFirstInList() {
        ClassForList classForList = new ClassForList();
        classForList.add(3);
        classForList.add(5);
        classForList.add(4);
        assertThat(classForList.ourList().get(0), equalTo(Integer.valueOf(4)));
    }

    @Test
    public void testDuplicatesAreRemovedFromList() {
        ClassForList classForList = new ClassForList();
        classForList.add(3);
        classForList.add(3);
        classForList.add(4);

        List<Integer> testList = new ArrayList<Integer>();
        testList.add(4);
        testList.add(3);
        assertThat(classForList.ourList(), equalTo(testList));
    }
}


