package ua.kpi.tef.controller;
import java.util.SimpleTimeZone;
import java.util.regex.*;
/**
 * Created by Zigzagger on 04.04.2017.
 */
public interface RegexContainer {
    String REG_NAME = "^[A-Z]{1}[a-z'-]{1,}|[А-Я]{1}[а-я'-]{1,}$";
    String REG_LAST_NAME = "^([A-Z]{1}[a-z'-[A-Z]?]{1,})|([А-Я]{1}[а-я'-[А-Я]?]{1,})$";
    String REG_EMAIL = "([A-Z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}";
    String REG_LOGIN = "^[A-Za-z0-9_.]{4,20}$";
    String REG_COMMENTS = "^(([a-zA-z0-9]){0,}([\\s]){0,1}([\\.]){0,1}([\\s]){0,1}([A-Z]){1}([a-z]){1,})+$";
    String REG_MOBILE_FIRST_NUMBER = "^([0-9]){10}$";
    String REG_MOBILE_SECOND_NUMBER = "^([0-9]){0,10}$";
    String REG_HOME_PHONE = "^([0-9]){6}$";
    String REG_SKYPE = "^([A-Za-z0-9_.]){4,20}$";
    String REG_INDEX = "^([0-9]){5}$";
    String REG_STREET = "^([a-z_.]){0,3}([A-Z]){1}([a-z]){1,}$";
    String REG_CITY = "^([A-Z]){1}([a-z]{1,}]$";
    String REG_FLAT = "^([0-9]){1,4}$";
    String REG_HOME_NUMBER = "^([A-Z]){0,2}([0-9]){1,3}$";

}
