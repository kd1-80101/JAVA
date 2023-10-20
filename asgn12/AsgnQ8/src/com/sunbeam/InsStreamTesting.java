package com.sunbeam;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class InsStreamTesting {

	public static void main(String[] args) {
		IntStream stream1 = IntStream.iterate(1, x -> x + 1).limit(10);
		System.out.println(stream1.sum()); //55

		IntStream stream2 = IntStream.iterate(1, x -> x + 1).limit(10);
		System.out.println(stream2.summaryStatistics()); //IntSummaryStatistics{count=10, sum=55, min=1, average=5.500000, max=10}

		IntStream stream3= IntStream.iterate(1, x -> x + 1).limit(10);
		IntSummaryStatistics a= stream3.summaryStatistics();
		System.out.println(a);
	}

}
