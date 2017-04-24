package ua.kpi.tef.model.Entity;

/**
 * Created by Zigzagger on 04.04.2017.
 */
public class Person {
    public String firstName;
    public String lastName;
    public String middleName;
    public String nickName;
    public String comments;
    public enum group {TV_51, TI_51, EPAM_JAVA, EPAM_QA}
    public String homePhone;
    public String mobilePhoneFirst;
    public String mobilePhoneSecond;
    public String email;
    public String skype;
    public String street;
    public String homeNumber;
    public String index;
    public String flat;
    public String city;

    public void setFirstName(String firstName){ this.firstName = firstName;}
    public void setLastName(String lastName){ this.lastName = lastName;}
    public void setMiddleName(String middleName){this.middleName = middleName;}
    public void setNickName(String nickName){this.nickName = nickName;}
    public void setComments(String comments){this.comments = comments;}
    public void setHomePhone(String homePhone){this.homePhone = homePhone;}
    public void setMobilePhoneFirst(String mobilePhoneFirst){this.mobilePhoneFirst = mobilePhoneFirst;}
    public void setMobilePhoneSecond(String mobilePhoneSecond){this.mobilePhoneSecond = mobilePhoneSecond;}
    public void setEmail(String email){this.email = email;}
    public void setSkype(String skype){this.skype = skype;}
    public void setStreet(String street){this.street = street;}
    public void setHomeNumber(String homeNumber){this.homeNumber = homeNumber;}
    public void setIndex(String index){this.index = index;}
    public void setFlat(String flat){this.flat = flat;}
    public void setCity(String city){this.city = city;}

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getMiddleName(){return middleName;}
    public String getNickName(){return nickName;}
    public String getComments(){return comments;}
    //public String getGroup(){return group;}
    public String getHomePhone(){return homePhone;}
    public String getMobilePhoneFirst(){return mobilePhoneFirst;}
    public String getMobilePhoneSecond(){return mobilePhoneSecond;}
    public String getEmail(){return email;}
    public String getSkype(){return skype;}
    public String getStreet(){return street;}
    public String getHomeNumber(){return homeNumber;}
    public String getIndex(){return index;}
    public String getFlat(){return flat;}
    public String getCity(){return city;}
}
