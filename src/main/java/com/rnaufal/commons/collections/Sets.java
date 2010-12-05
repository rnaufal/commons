package com.rnaufal.commons.collections;

import java.util.HashSet;

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

}
