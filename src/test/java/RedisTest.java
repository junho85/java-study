import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.exceptions.JedisDataException;

public class RedisTest {
    @Disabled
    @Test
    public void testSetNull() {
        Assertions.assertThrows(JedisDataException.class, () -> {
            JedisPool pool = new JedisPool(new JedisPoolConfig(), "labs.junho85.pe.kr");
            Jedis jedis = pool.getResource();
            jedis.set("abc", null);
        });
    }
}
