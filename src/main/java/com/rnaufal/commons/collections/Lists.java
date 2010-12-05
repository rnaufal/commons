package com.rnaufal.commons.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import org.apache.commons.lang.ArrayUtils;

/**
 * @author rnaufal
 * 
 */
public class Lists {

    private Lists() {
    }

    public static <E> ArrayList<E> newArrayList() {
	return new ArrayList<E>();
    }

    public static <E> LinkedList<E> newLinkedList() {
	return new LinkedList<E>();
    }

    public static <E> ArrayList<E> arrayAsList(E... elements) {
	if (ArrayUtils.isEmpty(elements)) {
	    return new ArrayList<E>();
	}
	return new ArrayList<E>(Arrays.asList(elements));
    }
}
