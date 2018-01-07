package edu.wzm.service;

import edu.wzm.domain.Person;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gatsbynewton on 2018/1/7.
 */
public class PersonServiceTest extends TestCase{
    private PersonService services;

    @Before
    public void setUp(){
        services = new PersonService();
    }

    @After
    public void tearDown() {
        System.out.println("Finished");
    }

    @Test
    public void testSelectWithIf(){
        Person person = new Person();
        person.setPname("Jimmy");
        services.selectWithIf(person);
    }

    @Test
    public void testSelectWithTwoLevelIf(){
        Person person = new Person();
        person.setPid(1);
        person.setPname("Jimmy");
        services.selectWithTwoLevelIf(person);
    }

    @Test
    public void testSelectWithIfWhere() {
        Person person = new Person();
        person.setPname("Jimmy");
        person.setPage(30);
        services.selectWithIfWhere(person);
    }

    @Test
    public void testSelectWithIfTrim(){
        Person person = new Person();
//        person.setPname("Steve");
        person.setPage(25);
        services.selectWithIfTrim(person);
    }

    @Test
    public void testSelectWithChooseWhen() {
        Person person = new Person();
//        person.setPname("Jimmy");
        person.setPage(30);
        services.selectWithChooseWhen(person);
    }

    @Test
    public void testSelectWithTwoLevelChooseWhen(){
        Person person = new Person();
        person.setPid(3);
        person.setPname("Jimmy");
//        person.setPage(30);
        services.selectWithTwoLevelChooseWhen(person);
    }

    @Test
    public void testSelectWithForeachArray(){
        int[] pids = {1, 3};
        services.selectWithForeachArray(pids);
    }

    @Test
    public void testSelectWithForeachList(){
        List<Integer> pids = new ArrayList<>();
        pids.add(2);
        pids.add(3);
        services.selectWithForeachList(pids);
    }

    @Test
    public void testUpdateWithIfSet(){
        Person person = new Person();
        person.setPid(2);
        person.setPname("Bill");
        services.updateWithIfSet(person);
    }

    @Test
    public void testUpdateWithIfTrim(){
        Person person = new Person();
        person.setPid(2);
        person.setPname("Newton");
        services.updateWithIfTrim(person);
    }
}
