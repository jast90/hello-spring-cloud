package me.jastz.hellofeignconsumer.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhiwen on 2017/8/21.
 */
public class HelloServiceTest {

    @Test
    public void testImplNotInheritedInterfaceTypeAnnotation() {
        boolean flag = HelloServiceImpl.class.isAnnotationPresent(FeignClient.class);
        if (flag) {
            System.out.println("实现类继承接口类型上的注解");
        } else {
            System.out.println("实现类不继承接口类型上的注解");
        }
        Assert.assertFalse(flag);
    }

    @Test
    public void testImplMethodNotInheritedInterfaceMethodAnnotation() {
        boolean flag = false;
        try {
            flag = HelloServiceImpl.class.getMethod("hello").isAnnotationPresent(GetMapping.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        if (flag) {
            System.out.println("实现类中的方法继承接口中方法上的注解");
        } else {
            System.out.println("实现类中的方法不继承接口中方法上的注解");
        }
    }

    @Test
    public void testImplMethodParamNotInheritedInterfaceMethodParamAnnotation() {
        boolean flag = false;
        try {
            flag = HelloServiceImpl.class.getMethod("hello", String.class, Integer.class).getParameters()[0].getAnnotatedType().isAnnotationPresent(RequestParam.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        if (flag) {
            System.out.println("实现类中方法的参数继承接口中方法参数上的注解");
        } else {
            System.out.println("实现类中方法的参数不继承接口中方法参数上的注解");
        }
    }


}
