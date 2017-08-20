package edu.wzm.driver;

import edu.wzm.services.PersonServices;

/**
 * Created by gatsbynewton on 2017/8/20.
 */
public class Driver {

    public static void main(String[] args){
        PersonServices services = new PersonServices();
        services.selectWithIf();
        services.selectWithIfWhere();
        services.selectWithIfTrim();
        services.selectWithChooseWhen();
        services.selectWithForeachArray();
        services.selectWithForeachList();

//        services.updateWithIfSet();
//        services.updateWithIfTrim();
    }
}
