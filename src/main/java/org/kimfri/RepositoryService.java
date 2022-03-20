package org.kimfri;

import java.util.Comparator;

public class RepositoryService {
    private final MyRepository myRepository;

    public RepositoryService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    String getLongestString() {
        return myRepository.getAllStrings().stream()
                .max(Comparator.comparing(String::length))
                .orElse("Empty");
    }
}
