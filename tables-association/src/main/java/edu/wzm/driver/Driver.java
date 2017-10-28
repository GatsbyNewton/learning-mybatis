package edu.wzm.driver;

import edu.wzm.services.AssociationService;

/**
 * Created by gatsbynewton on 2017/8/16.
 */
public class Driver {

    public static void main(String[] args){
        AssociationService service = new AssociationService();
        service.queryOneToMany();
        service.queryOneToManyAll();

        service.queryOneToManyPartial();
        service.queryOneToManyPartialAll();

        service.queryOneToOneById();
    }
}
