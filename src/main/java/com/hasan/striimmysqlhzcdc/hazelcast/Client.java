package com.hasan.striimmysqlhzcdc.hazelcast;

import com.hasan.pojo.ProductInv;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class Client {

    public static void main(String[] args) {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.getGroupConfig().setName("dev").setPassword("dev-pass");
        clientConfig.getNetworkConfig().addAddress("10.216.1.37");

        HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
        IMap<Long, ProductInv> productInv = client.getMap("ProductInv");

        System.out.println(productInv.size());
    }
}
