package com.guigu.maven;
/**       
 * <p>project_name:HelloFriend</p>
 * <p>package_name:com.guigu.maven.HelloFriend</p>
 * <p>description：</p>
 * <p>@author：刘老师<p>   
 * <p> date:2018年1月22日上午10:40:20 </p>
 * <p>comments：    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

public class HelloFriend {
    
    public String sayHelloToFriend(String name) {
        Hello hello =new Hello();
        String str=hello.sayHello(name)+"I am "+this.getMyName();
        System.out.println(str);
        return str;
    }
    
    public String getMyName() {
        return "zhangsan";
    }
}


