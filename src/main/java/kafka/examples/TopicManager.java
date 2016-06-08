package kafka.examples;

import kafka.admin.TopicCommand;

public class TopicManager {

	private static final String[] create_options = new String[]{
			"--create",
			"--zookeeper",
			"zk_host:port/chroot",
			"--partitions",
			"2",
			"--topic",
			"my_topic_name",
			"--replication-factor",
			"3",
			"--config",
			"x=y"
		};
	
	private static final String[] describe_options = new String[]{
			"--describe",
			"--zookeeper",
			"localhost:2181",
			"--topic",
			"topic1",
	};
	
	public static void describeTopic(){
		TopicCommand.main(describe_options);
	}
	
	public static void createTopic(){
		TopicCommand.main(create_options);
	}
}
