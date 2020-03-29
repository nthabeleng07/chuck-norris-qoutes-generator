package com.framework.ChuckNoris;

import com.framework.ChuckNoris.controller.JokeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ChuckNorrisApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(ChuckNorrisApplication.class, args);

		JokeController controller = (JokeController) ctx.getBean("jokeController");

		//System.out.println(controller.showJokes());

	}

}
