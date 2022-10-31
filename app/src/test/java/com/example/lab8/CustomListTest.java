package com.example.lab8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    @Before
    public CustomList createList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }
    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize +1);

    }
    @Test
    void testHasCity(){
        CustomList cityList = createList();
        City city = new City("Toronto","Ontario");
        City citys = new City("Strathcona","Alberta");
        cityList.add(city);
        assertTrue(cityList.hasCity(city));
        assertFalse(cityList.hasCity(citys));
    }
    @Test

    void testdelete(){
        CustomList cityList = createList();
        City city = new City("Strathcona","Alberta");
        City citys = new City("Vancouver","British Columbia");
        cityList.add(citys);
        assertThrows( IllegalArgumentException.class, ()->{cityList.delete(citys);});
        cityList.delete(citys);

    }


}
