package me.zavdav.abcd.providers;

import java.util.Queue;

public class LongProvider implements Provider<Long> {

    @Override
    public Long provide(Queue<String> args) {
        String str = args.poll();
        try {
            return Long.parseLong(str);
        } catch (Throwable t) {
            return null;
        }
    }

}
