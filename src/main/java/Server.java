import static spark.Spark.*;

import spark.ModelAndView;

import java.util.HashMap;
import java.util.Map;

import org.jtwig.JtwigModel;
import org.jtwig.JtwigTemplate;

public class Server {
    public static void main(String[] args) {
    	get("/", (rq, rs) -> {
			JtwigTemplate template = JtwigTemplate.classpathTemplate("templates/index.twig");
			JtwigModel model = JtwigModel.newModel().with("var", "World");
			//  JtwigModel model = JtwigModel.newModel((Map) modelAndView.getModel());
		
			return template.render(model);
		});
    }
}

