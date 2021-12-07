package ru.artem.kantukov.ComparePracticec;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable{
    private final String name;
    private final String secondName;
    private Integer age;
    private final String eMail;


    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public int compareTo(Person person) {
     int result = this.name.compareTo(person.name);
     if (result !=0){
         result = this.secondName.compareTo(person.secondName);
        }
     if (result != 0) {
         result = this.age.compareTo(person.age);
        }
     if (result !=0){
         result = this.eMail.compareTo(person.eMail);
     }
     return result;

    }
    @Override
    public String toString(){
        return name+ " " +secondName+ " : " +age+ " E-mail: " +eMail;
    }
}
