/**
 * 
 */
package com.rnaufal.commons.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
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
}
