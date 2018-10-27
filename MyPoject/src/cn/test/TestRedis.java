package cn.test;

import java.util.List;

import redis.clients.jedis.Jedis;

public class TestRedis {

	public static void main(String[] args) {	
		Jedis jedis =new Jedis("11.205.52.16");
		String p = jedis.ping();
		if ("PONG".equals(jedis)) {
			System.out.println("服务器正在运行...");
		} else {
			System.out.println("服务器运行失败，请重新重启...");
		}
		//redis 存储key/value 
		jedis.set("mycache", "大大大大");
	     System.out.println("redis 存储的字符串为: "+ jedis.get("mycache"));
		//redis 存储list
	     jedis.lpush("Cache", "cache1");
	     jedis.lpush("Cache", "cache2");
	     jedis.lpush("Cache", "cache3");
	     jedis.lpush("Cache", "cache4");
	     jedis.lpush("Cache", "cache5");
	     List<String> myCache = jedis.lrange("Cache", 0, 4);
	     for (int i = 0; i < myCache.size(); i++) {
			System.out.println(myCache.get(i));
		}
	}
}
