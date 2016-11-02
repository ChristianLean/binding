package com.example.binding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableBoolean;

/**
 * Created by christianlee on 2016-11-01.
 */
public class Employee extends BaseObservable {

    private  String mLastName;
    private  String mFirstName;

    public ObservableArrayMap<String,String>user = new ObservableArrayMap<>();
    private  String mAvatar;
    public ObservableBoolean isFired = new ObservableBoolean();

    public  Employee(String lastName , String firstName){
        mLastName = lastName;
        mFirstName = firstName;
        isFired.set(false);
    }

    public  Employee(String lastName,String firstName,boolean fired){
        mLastName = lastName;
        mFirstName = firstName;
        isFired.set(fired);
    }
    @Bindable
    public String getLastName(){
        return  mLastName;
    }
    public void setLastName(String lastName) {

        mLastName = lastName;

    }
    @Bindable
    public String getFirstName(){
        return  mFirstName;
    }
    public void setFirstName(String firstName) {
        mFirstName = firstName;


    }
    public void  setFired(boolean fired){
        isFired.set(fired);
    }
    public  String getAvator(){
        return  mAvatar;
    }
    public  void setmAvatar(String avatar){
        mAvatar = avatar;
    }
}
