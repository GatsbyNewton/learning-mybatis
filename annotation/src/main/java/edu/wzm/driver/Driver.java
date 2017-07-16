package edu.wzm.driver;

import edu.wzm.services.PersonServices;

/**
 * Created by gatsbynewton on 2017/7/15.
 */
public class Driver {

    public static void main(String[] args){
        PersonServices services = new PersonServices();
//        services.add();
//        services.update();
        services.getById();
        services.delete();
        services.getAll();
    }
}
