package com.git.wuqf.registry;

import com.git.wuqf.constant.ZKConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wuqf on 2016/12/13.
 */
public class ServiceRegistry {

    private static final Logger logger = LoggerFactory.getLogger(ServiceRegistry.class);
    private String registryAddress;
    private ZookeeperUtil zookeeperUtil;

    public ServiceRegistry(String registryAddress) {
        this.registryAddress = registryAddress;
        zookeeperUtil = new ZookeeperUtil(registryAddress);
    }

    public void register(String data) {
        zookeeperUtil.createNode(ZKConstant.ZK_DATA_PATH, data);
    }
}
