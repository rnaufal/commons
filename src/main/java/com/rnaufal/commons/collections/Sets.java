package com.rnaufal.commons.collections;

import static com.rnaufal.commons.collections.Lists.arrayAsList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @author rnaufal
 * 
 */
public class Sets {

    private Sets() {
    }

    public static <E> HashSet<E> newHashSet() {
	return new HashSet<E>();
    }

    public static <E> HashSet<E> newLinkedHashSet() {
	return new LinkedHashSet<E>();
    }

    public static <E> TreeSet<E> newTreeSet() {
	return new TreeSet<E>();
    }
    
    public static <E> HashSet<E> arrayAsSet(E ... elements) {
	return new HashSet<E>(arrayAsList(elements));
    }

}
