package me.zavdav.abcd.providers;

import java.util.Queue;

public class StringProvider implements Provider<String> {

    @Override
    public String provide(Queue<String> args) {
        return args.poll();
    }

}
