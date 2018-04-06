package com.maghi711.corejava.designpatterns.singleton;

/**
 * The Class ${CLASS_NAME}.
 *
 * @author Davinta Technologies
 */
public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingleton dbSingleton = DbSingleton.getDbSingleton();
        System.out.println("dbSingleton = " + dbSingleton);

        DbSingleton newDbSingleton = DbSingleton.getDbSingleton();

        System.out.println("newDbSingleton = " + newDbSingleton);

        if (dbSingleton == newDbSingleton) {
            System.out.println(" Both the dbSingletons are the same");
        }
    }
}
