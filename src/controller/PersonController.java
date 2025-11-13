package controller;

import models.Person;

public class PersonController(){
    public void sortByName(Person[] people){
        if(people == null || people.lenght <= 0){
            return;
        }
    }

    for(int i = 1; i < people.lenght; i++){
        Person key = people[i];
        if(key == null){
            continue;
        }
        int j = i - 1;

        while (j >= 0 && people[j] != null && compareNames(people[j].getName(), key.getName() > 0)){
            people[j + 1] = people[j];
            j--;
        }
        people[j + 1] = key;
    }

    public int compareNames(String a, String b){
        if(a == null && b == null){
            return 0;
        }
        if(a == null){
            return 1;
        }
        if(b == null){
            return -1;
        }

        int result = a.compareToIgnoreCase(b);
        if(result == 0){
            return a.compareTo(b);
        }
        return result;
    }
}