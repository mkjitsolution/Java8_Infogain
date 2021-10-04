package com.stream.reduce;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceBinary {

	public static void main(String[] args) {
		BinaryOperator<Integer> sum=(i1,i2)->i1+i2;
		Integer identity=0;
		Stream<Integer> stream= Stream.of(1,22,3);
		int red=stream.reduce(identity, sum);
		System.out.println(red);
	}

}
