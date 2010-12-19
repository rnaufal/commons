package com.rnaufal.commons.collections;

import static com.rnaufal.commons.collections.Lists.arrayAsList;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
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

    public static <E> HashSet<E> newHashSet(Collection<? extends E> elements) {
	return new HashSet<E>(elements);
    }

    public static <E> HashSet<E> newLinkedHashSet(
	    Collection<? extends E> elements) {
	return new LinkedHashSet<E>(elements);
    }

    public static <E> HashSet<E> newLinkedHashSet() {
	return new LinkedHashSet<E>();
    }

    public static <E> TreeSet<E> newTreeSet() {
	return new TreeSet<E>();
    }

    public static <E> HashSet<E> arrayAsSet(E... elements) {
	return new HashSet<E>(arrayAsList(elements));
    }

    public static <E> Set<? extends E> union(Set<? extends E> first,
	    Set<? extends E> second) {
	Set<E> result = newHashSet(first);
	result.addAll(second);
	return result;
    }
}