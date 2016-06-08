package kafka.examples;

import kafka.producer.Partitioner;
import kafka.utils.VerifiableProperties;

public class MessagePartitioner implements Partitioner {

	public MessagePartitioner(VerifiableProperties props) {

	}

	@Override
	public int partition(Object paramObject, int paramInt) {
		int key = Integer.valueOf(paramObject.toString());
		System.out.println(key);
		return key % paramInt;
	}

}
