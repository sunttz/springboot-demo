package com.stt;

import com.stt.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoApplicationTests {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate<String, User> redisTemplate;

	@Test
	public void contextLoads() {
        // 保存字符串
        stringRedisTemplate.opsForValue().set("aaa", "111");
        Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
	}

	@Test
	public void testRedis() {
	    User user = new User();
	    user.setName("哈哈");
	    user.setSex(1);
	    user.setAge(20);
	    redisTemplate.opsForValue().set("user", user);
    }

    @Test
    public void testRedisGet() {
        User user = redisTemplate.opsForValue().get("user");
        System.out.println(user);
    }

}
