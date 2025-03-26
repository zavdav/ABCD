package me.zavdav.abcd.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines the permission needed to execute a command.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Permission {

    /**
     * A list of permissions with which the command can be executed.
     * Only one of the permissions is needed to execute the command.
     */
    String[] value();
}
