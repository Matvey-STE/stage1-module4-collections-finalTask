package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String,Set<String>> entry: projects.entrySet()){
            if(entry.getValue().contains(developer)){
                result.add(entry.getKey());
            }
        }
        result.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o2.length()-o1.length() == 0){
                    o2.compareToIgnoreCase(o1);
                }
                return o2.length()-o1.length();
            }
        });
        return result;
    }
}
