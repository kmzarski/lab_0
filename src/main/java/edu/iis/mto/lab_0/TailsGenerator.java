package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String> tailsList = new ArrayList<>();
        if (!(value == null)) {

            tailsList.add(value);
            for (int i = 0; i < value.length() + 2; i++) {
                value = value.substring(1);
                tailsList.add(value);
            }
            tailsList.add("");
        }
        return tailsList;

    }

}
