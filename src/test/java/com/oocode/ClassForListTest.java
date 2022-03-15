package com.oocode;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;

public class ClassForListTest {
    @Test
    public void testEmptyListIsThereWhenClassIsInitialised() {
        List<Integer> testList = new ArrayList<Integer>();
        Assert.assertThat(new ClassForList().ourList(), equalTo(testList));
    }
    @Test
    public void testAddingThingsToList() {
        List<Integer> testList = new ArrayList<Integer>();
        testList.add(1);
        ClassForList assertList = new ClassForList();
        assertList.add(1);
        Assert.assertThat(assertList.ourList(), equalTo(testList));

    }
}


