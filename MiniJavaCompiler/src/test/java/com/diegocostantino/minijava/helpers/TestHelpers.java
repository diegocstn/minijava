package com.diegocostantino.minijava.helpers;

import java.io.InputStream;

public final class TestHelpers {
    static public InputStream readProg(String filename) {
        return ClassLoader.getSystemResourceAsStream(filename);
    }
}
