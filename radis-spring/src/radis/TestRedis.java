package radis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

public class TestRedis {

	@Test
	public void testSet() {
		String conf = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(conf);
		ShardedJedis jedis = ctx.getBean("shardedJedisPool", ShardedJedisPool.class).getResource();
		jedis.set("name", "test");
	}

	@Test
	public void testGet() {
		String conf = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(conf);
		ShardedJedis jedis = ctx.getBean("shardedJedisPool", ShardedJedisPool.class).getResource();
		String name = jedis.get("name");
		System.out.println(name);
	}

}