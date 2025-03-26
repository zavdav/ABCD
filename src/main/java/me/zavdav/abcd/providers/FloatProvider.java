package me.zavdav.abcd.providers;

import java.util.Queue;

public class FloatProvider implements Provider<Float> {

    @Override
    public Float provide(Queue<String> args) {
        String str = args.poll();
        try {
            return Float.parseFloat(str);
        } catch (Throwable t) {
            return null;
        }
    }

}
