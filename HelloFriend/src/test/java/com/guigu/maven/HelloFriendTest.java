package com.guigu.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**       
 * <p>project_name:HelloFriend</p>
 * <p>package_name:com.guigu.maven.HelloFriendTest</p>
 * <p>description：</p>
 * <p>@author：刘老师<p>   
 * <p> date:2018年1月22日上午10:48:25 </p>
 * <p>comments：    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

public class HelloFriendTest {
    @Test
    public void testHelloFriend() {
        HelloFriend helloFriend =new HelloFriend();
        String result =helloFriend.sayHelloToFriend("lisi");
        assertEquals("Hellolisi!I am zhangsan", result);
    }
}


