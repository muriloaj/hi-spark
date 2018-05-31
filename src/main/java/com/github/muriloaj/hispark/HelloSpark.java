package com.github.muriloaj.hispark;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.get;
import static spark.Spark.stop;

public class HelloSpark {


    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(HelloSpark.class);
        logger.info("Sparking engines......");
        get("/hello", (req, res) -> "Hello Spark");

        get("/stop", (req, res) -> {
            logger.info("BBye Baby John ......");
            stop();
            return "bye....";
        });
    }

}