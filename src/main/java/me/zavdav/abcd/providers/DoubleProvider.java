package me.zavdav.abcd.providers;

import java.util.Queue;

public class DoubleProvider implements Provider<Double> {

    @Override
    public Double provide(Queue<String> args) {
        String str = args.poll();
        try {
            return Double.parseDouble(str);
        } catch (Throwable t) {
            return null;
        }
    }

}
