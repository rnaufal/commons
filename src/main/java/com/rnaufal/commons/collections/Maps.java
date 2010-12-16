package com.rnaufal.commons.collections;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author rnaufal
 * 
 */
public class Maps {

    private Maps() {
    }

    public static <K, V> HashMap<K, V> newHashMap() {
	return new HashMap<K, V>();
    }

    public static <K, V> HashMap<K, V> newLinkedHashMap() {
	return new LinkedHashMap<K, V>();
    }

    public static <K, V> TreeMap<K, V> newTreeMap() {
	return new TreeMap<K, V>();
    }

    public static <K, V> TreeMap<K, V> newTreeMap(
	    Comparator<? super K> comparator) {
	return new TreeMap<K, V>(comparator);
    }

    public static <K, V> Map.Entry<K, V> entry(K key, V value) {
	return new AbstractMap.SimpleEntry<K, V>(key, value);
    }

    public static <K, V> HashMap<K, V> newHashMap(List<Map.Entry<K, V>> entries) {
	HashMap<K, V> result = new HashMap<K, V>();
	for (Map.Entry<K, V> entry : entries) {
	    result.put(entry.getKey(), entry.getValue());
	}
	return result;
    }
}