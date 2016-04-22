import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args){
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/guess", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/guess.vtl" );
      String originalPhrase = request.queryParams("phrase");
      String parsedPhrase = VowelReplacement.replace(originalPhrase);
      model.put("parsedPhrase", parsedPhrase);
      model.put("originalPhrase", originalPhrase);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/result", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/result.vtl" );
      String guess = request.queryParams("guess");
      String originalPhrase = request.queryParams("originalPhrase");

      Boolean result = guess.toLowerCase().equals(originalPhrase.toLowerCase());
      model.put("result", result);
      model.put("originalPhrase", originalPhrase);
      model.put("guess", guess);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
