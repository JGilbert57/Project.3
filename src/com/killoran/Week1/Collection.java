package com.killoran.Week1;

import java.util.*;
/**
 * Created by 111618 on 3/5/2019.
 */
public class Collection {
    ArrayList<Contact> blackbook = new ArrayList<>();
    public void addContact(Contact person){
        blackbook.add(person);
    }
    public void display(){
        for(Contact contact: blackbook){
            System.out.println(contact.toString());
        }
    }

}
