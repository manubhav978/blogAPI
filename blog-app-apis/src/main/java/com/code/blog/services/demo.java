package com.code.blog.services;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List< Integer> l1 = Arrays.asList(6,7,6,8,5);
		Map<Object, Long> dup = l1.stream().collect(Collectors.groupingBy(s->s, Collectors.counting()));
		System.out.println(dup);
	}

}
