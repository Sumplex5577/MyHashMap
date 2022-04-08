package com.company;

import java.util.HashMap;
import java.util.Map;
import java.time.LocalDateTime;
import java.util.Objects;

//import static java.util.Objects.isNull;


public class ShowroomHashMap<K, V> implements AutoMap <com.company.Auto, java.lang.Integer> {

    private Map<com.company.Auto, Integer> map = new HashMap();
    public ShowroomHashMap() {

    }
    public ShowroomHashMap(int capacity) {
        map = new HashMap<>(capacity);
    }

    @Override
    public boolean put(com.company.Auto key, java.lang.Integer value) {
        if (isNull(key) || isNull(value)) {
            return false;
        }
        if (value < 0) {
            return false;
        }
        if (key.getYear() > LocalDateTime.now().getYear()) {
            return false;
        }
        map.put(key, value);
        return true;
    }

    @Override
    public boolean remove(com.company.Auto key) {
        if(isNull(key)) {
            return false;
        }
        map.remove(key);
        return true;
    }

    @Override
    public boolean containsKey(com.company.Auto key) {
        if(isNull(key)) {
            return false;
        }
        return map.containsKey(key);
    }

    @Override
    public java.lang.Integer get(com.company.Auto key) {
        if(isNull(key)) {
            return null;

        }
        return map.get(key);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public Integer[] toArray() {
        return map.values().toArray(new Integer[0]);
    }
    public String toString() {
        return map.toString();
    }

    //TECHNICAL METHOD

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShowroomHashMap)) return false;
        ShowroomHashMap<?, ?> that = (ShowroomHashMap<?, ?>) o;
        return Objects.equals(map, that.map);
    }

    public int hashCode() {
        return Objects.hash(map);
    }

    private boolean isNull(Object o) {
        return o == null;
    }
}



















