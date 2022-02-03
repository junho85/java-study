package hello;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisExample {
    public static void main(String[] args) {
        JedisPool pool = new JedisPool(new JedisPoolConfig(), "labs.junho85.pe.kr");
        Jedis jedis = pool.getResource();
        System.out.println(jedis.get("abc"));
        System.out.println(jedis.get("ccc"));

    }
}
