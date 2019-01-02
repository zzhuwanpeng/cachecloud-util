import com.sohu.tv.builder.ClientBuilder;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.JedisCluster;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonRedisDaoImpl  {

    private static JedisCluster jedisCluster;

    private static long appId = 10013;

    static {
        /**
         * 使用自定义配置：
         * 1. setTimeout：redis操作的超时设置；
         * 2. setMaxRedirections：节点定位重试的次数；
         */
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        jedisCluster = ClientBuilder.redisCluster(appId)
                .setJedisPoolConfig(poolConfig)
                .setConnectionTimeout(1000)
                .setSoTimeout(1000)
                .setMaxRedirections(5)
                .build();
    }


    public void setTestValue(){
//        String a = jedisCluster.get("1111");
//        System.out.println("a="+a);
       System.out.println(111);
//       jedisCluster.sadd(RedisConstants.KEY_OF_WEI_LAI_IMG,"1100000062001");
        Map<String,String> map = jedisCluster.hgetAll(RedisConstants.KEY_OF_WEI_LAI_IMG);
        for(String key : map.keySet()){
            System.out.println(key +":"+ map.get(key));
        }
//        jedisCluster.sadd()
    }


}
