package me.zavdav.abcd.command;

import me.zavdav.abcd.providers.Provider;

import java.util.List;

/**
 * A {@link CommandDispatcher} is the heart of <b>ABCD</b>. It is used
 * to register and dispatch commands, as well as to add providers.
 */
public class CommandDispatcher {

    /**
     * Registers a new command from an instance.
     *
     * @param obj the command instance
     */
    public void registerCommand(Object obj) {
        return;
    }

    /**
     * Registers a new command by using a class's default constructor to create an instance.
     *
     * @param cls the command class
     */
    public void registerCommand(Class<?> cls) {
        return;
    }

    /**
     * Unregisters a command.
     *
     * @param cls the command class
     */
    public void unregisterCommand(Class<?> cls) {
        return;
    }

    /**
     * Registers a new command from an instance.
     *
     * @param obj the command instance
     * @return the {@link CommandDispatcher} with the new command
     */
    public CommandDispatcher withCommand(Object obj) {
        return null;
    }

    /**
     * Registers a new command by using a class's default constructor to create an instance.
     *
     * @param cls the command class
     * @return the {@link CommandDispatcher} with the new command
     */
    public CommandDispatcher withCommand(Class<?> cls) {
        return null;
    }

    /**
     * Adds a new provider for a class.
     *
     * @param cls the class
     * @param provider the provider
     * @param <T> the provider's type
     */
    public <T> void addProvider(Class<T> cls, Provider<T> provider) {
        return;
    }

    /**
     * Removes a provider for a class.
     *
     * @param cls the class
     * @param <T> the provider's type
     */
    public <T> void removeProvider(Class<T> cls) {
        return;
    }

    /**
     * Adds a new provider for a class.
     *
     * @param cls the class
     * @param provider the provider
     * @param <T> the provider type
     * @return the {@link CommandDispatcher} with the new provider
     */
    public <T> CommandDispatcher withProvider(Class<T> cls, Provider<T> provider) {
        return null;
    }

    /**
     * Dispatches a command.
     *
     * @param cmdLine the command line
     */
    public void dispatch(String cmdLine) {
        return;
    }

    /**
     * Dispatches a command.
     *
     * @param strings the strings
     */
    public void dispatch(String[] strings) {
        return;
    }

    /**
     * Dispatches a command.
     *
     * @param strings the strings
     */
    public void dispatch(List<String> strings) {
        return;
    }
}
