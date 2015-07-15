import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.exceptions.JedisDataException;

public class RedisTest {
    @Test(expected=JedisDataException.class)
    public void testSetNull() {
        JedisPool pool = new JedisPool(new JedisPoolConfig(), "labs.junho85.pe.kr");
        Jedis jedis = pool.getResource();
        jedis.set("abc", null);
    }
}
