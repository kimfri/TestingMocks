package org.kimfri;

import java.util.ArrayList;
import java.util.List;

public class MyRepository {
    private final List<String> stringList = new ArrayList<>();
    List<String> getAllStrings() {
        return new ArrayList<>(stringList);
    }

    String getStringByIndex(int index) {
        return stringList.get(index);
    }
}
