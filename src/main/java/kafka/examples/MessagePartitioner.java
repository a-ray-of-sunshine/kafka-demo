package kafka.examples;

import kafka.producer.Partitioner;

public class MessagePartitioner implements Partitioner {

	@Override
	public int partition(Object paramObject, int paramInt) {
		System.out.println(paramInt);
		System.out.println(paramObject);
		return 0;
	}

}
