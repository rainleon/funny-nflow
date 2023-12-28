package org.example;

import io.nflow.jetty.StartNflow;

/**
 * Created by rainleon on 2023-12-28.
 *
 * @Description: $description
 */
public class Main {
    public static void main(String[] args) throws Exception {
        new StartNflow().startJetty(7500, "local", "");
    }
}