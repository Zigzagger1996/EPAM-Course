package ua.kpi.tef.controller;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import ua.kpi.tef.Main;
import ua.kpi.tef.model.Entity.Person;
import ua.kpi.tef.view.*;
import ua.kpi.tef.model.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Zigzagger on 04.04.2017.
 */
public class InputNoteNoteBook implements TextConstants{
    //все данные записной книги
    //можно поддтягивать вьюшку
    //тут вызываються unility method, проверяем локаль, и поддтягиваем различне регулялрки

    Model model = new Model();
    View view  = new View();
    Person person = new Person();
    Scanner scanner = new Scanner(System.in);

    //все проверки с регулярками перекинуть в ютилити методы
    public String inputTrueStringValueWithScanner(Scanner sc, String regex, String errorMessage){
        String str = sc.next();
        while(!correctDataInput(str, regex)){
            view.printMessage(errorMessage);
            str = sc.next();
        }
        return str;
    }

    public int inputTrueIntValueWithScanner(Scanner sc, String regex, String errorMessage) {
        String data = sc.next();
        while( ! correctDataInput(data, regex)) {
        view.printMessage(errorMessage);
            sc.nextInt();
        }
        return sc.nextInt();
    }

    public boolean correctDataInput(String stringToCheck, String regex){
        Pattern pt = Pattern.compile(regex);
        Matcher m = pt.matcher(stringToCheck);
        return m.matches();
    }

    public void inputUserInfo(){
        view.printMessage(View.ENTER_USER_FIRST_NAME);
        person.setFirstName(inputTrueStringValueWithScanner(scanner, RegexContainer.REG_NAME, View.WRONG_NAME_INPUT));
        view.printMessage(View.ENTER_USER_LAST_NAME);
        person.setLastName(inputTrueStringValueWithScanner(scanner, RegexContainer.REG_LAST_NAME, View.WRONG_NAME_INPUT));
        view.userInitials(person.getFirstName(), person.getLastName());
        view.printMessage(View.ENTER_USER_MIDDLE_NAME);
        person.setMiddleName(inputTrueStringValueWithScanner(scanner, RegexContainer.REG_NAME, View.WRONG_NAME_INPUT));
        view.printMessage(View.ENTER_USER_LOGIN);
        person.setNickName(inputTrueStringValueWithScanner(scanner, RegexContainer.REG_LOGIN, View.WRONG_LOGIN_INPUT));
        view.printMessage(View.ENTER_USER_COMMENTS);
        person.setComments(inputTrueStringValueWithScanner(scanner, RegexContainer.REG_COMMENTS, View.WRONG_COMMENT_INPUT));
        //view.printMessage(View.ENTER_USER_GROUP);
        //person.setGroup(utilityController.userGroup(inputStringValueWithScanner(scanner)));
        view.printMessage(View.ENTER_USER_PHONE_NUMBER_HOME);
        person.setHomePhone(inputTrueStringValueWithScanner(scanner, RegexContainer.REG_HOME_PHONE, View.WRONG_HOME_NUMBER_INPUT));
        view.printMessage(View.ENTER_USER_PHONE_NUMBER_MOBILE);
        person.setMobilePhoneFirst(inputTrueStringValueWithScanner(scanner, RegexContainer.REG_MOBILE_FIRST_NUMBER, View.WRONG_NUMBER_INPUT));
        view.printMessage(View.ENTER_USER_PHONE_NUMBER_MOBILE_2);
        person.setMobilePhoneSecond(inputTrueStringValueWithScanner(scanner, RegexContainer.REG_MOBILE_SECOND_NUMBER, View.WRONG_NUMBER_INPUT));
        view.printMessage(View.ENTER_USER_EMAIL);
        person.setEmail(inputTrueStringValueWithScanner(scanner, RegexContainer.REG_EMAIL, View.WRONG_EMAIL_INPUT));
        view.printMessage(View.ENTER_USER_SKYPE);
        person.setSkype(inputTrueStringValueWithScanner(scanner, RegexContainer.REG_SKYPE, View.WRONG_LOGIN_INPUT));
        view.printMessage(View.ENTER_USER_INDEX);
        person.setIndex(inputTrueStringValueWithScanner(scanner, RegexContainer.REG_INDEX, View.WRONG_INDEX));
        view.printMessage(View.ENTER_USER_STREET);
        person.setStreet(inputTrueStringValueWithScanner(scanner, RegexContainer.REG_STREET, View.WRONG_STREET_INPUT));
        view.printMessage(View.ENTER_USER_HOUSE_NUMBER);
        person.setHomeNumber(inputTrueStringValueWithScanner(scanner, RegexContainer.REG_HOME_NUMBER, View.WRONG_HOME_NUMBER));
        view.printMessage(View.ENTER_USER_FLAT_NUMBER);
        person.setFlat(inputTrueStringValueWithScanner(scanner, RegexContainer.REG_FLAT, View.WRONG_FLAT_INPUT));
        view.printMessage(View.ENTER_USER_CITY);
        person.setCity(inputTrueStringValueWithScanner(scanner, RegexContainer.REG_CITY, View.WRONG_CITY_INPUT));
        view.printMessage(View.ENTER_USER_ADDRESS);
        view.userAddress(person.getIndex(), person.getStreet(), person.getHomeNumber(), person.getFlat(), person.getCity());
    }
}
