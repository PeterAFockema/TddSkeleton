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
}


