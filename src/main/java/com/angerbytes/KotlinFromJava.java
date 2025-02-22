package com.angerbytes;

import com.angerbytes.interoperativity.Person2;
import com.angerbytes.poo.generics.MaxKt;
import com.angerbytes.poo.interfaces.Car;

public class KotlinFromJava {
    public static void main(String[] args) {
        Person2 rob = new Person2("Robert", "Martin");

        /* using printf
             %s -> String
             %f -> float
             %d -> decimal(int)
             %n -> line jump
             %c	-> char
             %b	-> boolean
             %e -> scientific notation
             %g -> general number ( depends on the length it will be %d or %e
             %o	-> octal
             %x -> hexadecimal
             %h -> Hash code
             %t	-> Date/Time
             %%	-> Literal %
        */
        System.out.printf("His name is %s!%n",  rob.getFirstName());
        System.out.printf("His name is %s %s!%n",  rob.getFirstName(), rob.getLastName());
        rob.setFirstName("Uncle Bob");
        System.out.printf("His name is now %s!%n",  rob.getFirstName());

        // to use Max.kt file in generics it will be shown as MaxKT, putting the KT end as default
        Integer maxInt = MaxKt.max(2001,2022);
        System.out.printf("The max value is %d", maxInt);

    }

}
