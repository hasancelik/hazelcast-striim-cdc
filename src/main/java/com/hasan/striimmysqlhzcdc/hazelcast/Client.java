package com.hasan.striimmysqlhzcdc.hazelcast;

import com.hasan.striimmysqlhzcdc.mysql.ProductInv;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class Client {

    public static void main(String[] args) {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.getGroupConfig().setName("dev").setPassword("dev-pass");
        clientConfig.getNetworkConfig().addAddress("192.168.1.104");

        HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
        IMap<Long, ProductInv> productInv = client.getMap("ProductInv");

        System.out.println(productInv.size());
    }
}
