package edu.wzm.driver;

import edu.wzm.services.OrderServices;

/**
 * Created by gatsbynewton on 2017/8/15.
 */
public class Driver {

    public static void main(String[] args){
        OrderServices services = new OrderServices();
//        services.add();
        services.queryWithNothing();
        services.queryWithAlias();
        services.queryWithMapping();
    }
}
