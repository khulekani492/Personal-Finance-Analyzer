package org.khuleDev;

import io.javalin.Javalin;
import io.javalin.rendering.*;

import io.javalin.rendering.*;
import io.javalin.rendering.template.JavalinThymeleaf;

public class controller {
    void main() {
        Javalin.create(config -> {

            config.fileRenderer(new JavalinThymeleaf());
            config.staticFiles.add("/public");
            config.routes.get("/",ctx ->{
                ctx.render("templates/index.html");
            });
        }).start(7090);
    }

}
