package me.zavdav.abcd.providers;

import java.util.Queue;

public class BooleanProvider implements Provider<Boolean> {

    @Override
    public Boolean provide(Queue<String> args) {
        String str = args.poll();
        try {
            return Boolean.parseBoolean(str);
        } catch (Throwable t) {
            return null;
        }
    }

}
