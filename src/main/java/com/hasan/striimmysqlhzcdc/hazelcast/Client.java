package com.hasan.striimmysqlhzcdc.hazelcast;

import com.hasan.striimmysqlhzcdc.mysql.ProductInv;
import com.hasan.striimmysqlhzcdc.mysql.ProductKey;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.getGroupConfig().setName("dev").setPassword("dev-pass");
        clientConfig.getNetworkConfig().addAddress("192.168.1.104");

        HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
        IMap<ProductKey, ProductInv> productInv = client.getMap("CompProductInv");

        System.out.println(productInv.size());
        Iterator<ProductKey> iterator = productInv.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(productInv.get(iterator.next()));
        }
    }
}
