package test;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.util.*;

public class test {
    public static void main(String [] args){
        Set<HostAndPort> nodes = new HashSet<HostAndPort>();
        for(int i = 9002; i < 9010; i++ ){
            nodes.add(new HostAndPort("127.0.0.1",i));
        }
        JedisCluster jedisCluster = new JedisCluster(nodes);
        System.out.println(jedisCluster.get("cli"));
        Jedis jedis = new Jedis("127.0.0.1",9002);
        System.out.println(jedis.keys("*"));
    }
}
