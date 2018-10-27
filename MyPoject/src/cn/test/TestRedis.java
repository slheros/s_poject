package cn.test;

import java.util.List;

import redis.clients.jedis.Jedis;

public class TestRedis {

	public static void main(String[] args) {	
		Jedis jedis =new Jedis("11.205.52.16");
		String p = jedis.ping();
		if ("PONG".equals(jedis)) {
			System.out.println("��������������...");
		} else {
			System.out.println("����������ʧ�ܣ�����������...");
		}
		//redis �洢key/value 
		jedis.set("mycache", "�����");
	     System.out.println("redis �洢���ַ���Ϊ: "+ jedis.get("mycache"));
		//redis �洢list
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
