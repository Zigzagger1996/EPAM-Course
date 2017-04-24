package ua.kpi.tef.controller;

import com.sun.xml.internal.ws.server.ServerRtException;
import ua.kpi.tef.model.Entity.Person;
import ua.kpi.tef.model.Model;
import ua.kpi.tef.view.View;

import java.util.Scanner;

/**
 * Created by Zigzagger on 04.04.2017.
 */
public class UtilityController {
    //ввод разных данных
    //собераються сообщения с введеными данныеми + регулярными выражениями
    Model model = new Model();
    View view = new View();

    public void checkUserGroup(String userGroup, String errorMessage){
        Person.group group = Person.group.valueOf(userGroup);
        while ( ! userGroup.equals(group) ){
            view.printMessage(errorMessage);
        }
    }
}
