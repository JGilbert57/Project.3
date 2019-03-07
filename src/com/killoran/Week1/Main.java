//John Gilbert 02/27/2019
package com.killoran.Week1;

public class Main {

    public static void main(String[] args) {
        Contact contact = new Contact("Johnny", "johnnygilbert57@gmail.com");
        Collection person = new Collection();
        person.addContact(contact);
        BusinessContact mark = new BusinessContact("Killoran", "Killoran@gmail.com", "(614)-381-3414");
        Contact person3 = mark;
        person.addContact(person3);
        person.display();
    }
}

