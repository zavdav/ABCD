package me.zavdav.abcd.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines that a class or method is a subcommand of another command.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Subcommand {

    /**
     * The labels that the subcommand can be called with.
     * The first label is the primary label, and as such
     * at least one label always has to be provided.
     */
    String[] value();

    /**
     * The class of the subcommand's parent command.
     * This only has to be set if the subcommand is
     * in a different file than the parent command.
     */
    Class<?> parent() default Void.class;
}
