package com.jam.jamback;

import spark.servlet.SparkApplication;
import static spark.Spark.*;

public class JAMbackApp implements SparkApplication {

	@Override
	public void init() {
		get("/hello", (req, res) -> "Hello World");
	}

}
