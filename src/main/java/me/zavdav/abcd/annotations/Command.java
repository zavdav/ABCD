package me.zavdav.abcd.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines that a class or method is a command.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Command {

    /**
     * The labels that the command can be called with.
     * The first label is the primary label, and as such
     * at least one label always has to be provided.
     */
    String[] value();
}
