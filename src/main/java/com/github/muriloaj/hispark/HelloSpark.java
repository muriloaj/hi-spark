package com.github.muriloaj.hispark;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.stop;

public class HelloSpark {


    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(HelloSpark.class);
        logger.info("Sparking engines......");
        get("/hello", (req, res) -> "Hello Spark");

        get("/stop", (req, res) -> {
            Map<String, Object> model = new HashMap<>();

            logger.info("BBye Baby John ......");
            stop();
            return "bye....";
        });
    }

}