package com.maghi711.corejava.designpatterns.singleton;

/**
 * The Class ${CLASS_NAME}.
 *
 * @author Davinta Technologies
 */
public class DbSingleton {

    // Eagerly Loaded object.
    //private static DbSingleton dbSingleton = new DbSingleton();

    // Lazy Loaded
    // Volatile
    private static volatile DbSingleton dbSingleton = null;

    private DbSingleton() {
        // Handles creation of object by reflection.
        if (dbSingleton != null) {
            throw new RuntimeException("You cannot create a new instance when one already exist. better luck next time.");
        }
    }

    public static DbSingleton getDbSingleton() {
        // Double locking mechanism for thread safe lazy loading a singleton,
        if (dbSingleton == null) {
            synchronized (DbSingleton.class) {
                if (dbSingleton == null) {
                    dbSingleton = new DbSingleton();
                }
            }
        }
        return dbSingleton;
    }
}
