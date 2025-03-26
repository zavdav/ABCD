package me.zavdav.abcd.providers;

import java.util.Queue;

public class IntProvider implements Provider<Integer> {

    @Override
    public Integer provide(Queue<String> args) {
        String str = args.poll();
        try {
            return Integer.parseInt(str);
        } catch (Throwable t) {
            return null;
        }
    }

}
