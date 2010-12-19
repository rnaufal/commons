package com.rnaufal.commons.collections;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;

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

    public static <K, V> HashMap<K, V> newHashMapFrom(
	    Map<? extends K, ? extends V> map) {
	return new HashMap<K, V>(map);
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
	if (CollectionUtils.isEmpty(entries)) {
	    throw new IllegalArgumentException("Entries is invalid");
	}
	HashMap<K, V> result = newHashMap();
	collectEntriesFrom(entries, result);
	return result;
    }

    public static <K, V> Map<K, V> union(Map<K, V> first, Map<K, V> second) {
	if (MapUtils.isEmpty(first) || MapUtils.isEmpty(second)) {
	    throw new IllegalArgumentException("Maps are invalid");
	}
	Map<K, V> result = newHashMapFrom(first);
	collectEntriesFrom(second.entrySet(), result);
	return result;
    }

    private static <K, V> void collectEntriesFrom(
	    Collection<Map.Entry<K, V>> entries, Map<K, V> result) {
	for (Map.Entry<? extends K, ? extends V> entry : entries) {
	    result.put(entry.getKey(), entry.getValue());
	}
    }
}