package com.hz;

import java.util.Arrays;
import java.util.List;

public class ConsoleReadAdapter {
    private static List<String> trueValues = Arrays.asList("true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise");

    public boolean trueline(ConsoleReader reader) {
        String output = reader.readLine();
        return trueValues.contains(output);
    }
}
