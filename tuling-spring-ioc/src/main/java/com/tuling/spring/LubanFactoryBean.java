package com.tuling.spring;/**
 * Created by Administrator on 2018/8/23.
 */

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Tommy
 *         Created by Tommy on 2018/8/23
 **/
public class LubanFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new HelloSpring();
    }

    @Override
    public Class<?> getObjectType() {
        return HelloSpring.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
