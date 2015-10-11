/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.graphaware.elasticsearch.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author ale
 */
public class TestUtil {
    public static void deleteDataDirectory() {
        try {
//      FileUtils.deleteDirectory(new File(ElasticSearchClusterRunnerWrapper.DEFAULT_DATA_DIRECTORY));
//      FileUtils.deleteDirectory(new File(ESClientWrapper.DEFAULT_DATA_DIRECTORY));
            FileUtils.deleteDirectory(new File("data"));
        } catch (IOException e) {
            throw new RuntimeException("Could not delete data directory of embedded elasticsearch server", e);
        }
    }

    public static void waitFor(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}