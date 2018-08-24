package com.tuling.spring;/**
 * Created by Administrator on 2018/8/22.
 */

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

/**
 * @author Tommy
 *         Created by Tommy on 2018/8/22
 **/
public class LubanFactory {

    public static void initBeanDefinitionRegistry(){
        // 读取器
        BeanDefinitionRegistry registry=new  DefaultListableBeanFactory();
        BeanDefinitionReader reader=new XmlBeanDefinitionReader(registry);
        reader.loadBeanDefinitions("spring.xml");
        registry.getBeanDefinitionNames();
    }

    public static void initFactory() {
        DefaultResourceLoader loader = new DefaultResourceLoader();
        Resource resource = loader.getResource("spring.xml");
        XmlBeanFactory factory = new XmlBeanFactory(resource);
        HelloSpring helloSpring = factory.getBean(HelloSpring.class);
        helloSpring.sayHello();
    }


    public static void initContext1(){
        GenericApplicationContext context=new GenericApplicationContext();
        BeanDefinitionReader reader=new XmlBeanDefinitionReader(context);
        reader.loadBeanDefinitions("spring.xml");
        context.getBean(HelloSpring.class);
    }


    public static void initContext() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.getBeansOfType(HelloSpring.class);
        context.getBean("helloSpringAutowireConstructor");
    }

    public static void main(String[] args) {
        initContext();
//        initBeanDefinitionRegistry();
    }


}
