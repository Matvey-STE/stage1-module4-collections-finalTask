package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        for (Map.Entry<String,Integer> entry : sourceMap.entrySet()){
            if (result.containsKey(entry.getKey().length())){
                result.get(entry.getKey().length()).add(entry.getKey());
            } else {
                result.put(entry.getKey().length(), new HashSet<>(Collections.singleton(entry.getKey())));
            }
        }
        return result;
    }
}
