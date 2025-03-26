package me.zavdav.abcd.providers;

import java.util.Queue;

/**
 * Provides a value of type <code>T</code> parsed from a variable number of string arguments.
 *
 * @param <T> the type to be provided
 */
public interface Provider<T> {

    /**
     * Takes one or more string arguments from a list of arguments
     * and parses them into a value of type <code>T</code>.
     *
     * @param args the command arguments
     * @return a value of type <code>T</code>, or null if the arguments could not be parsed
     */
    T provide(Queue<String> args);
}
