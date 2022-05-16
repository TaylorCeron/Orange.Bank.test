package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"seleniumgluecode"},
        plugin = ("json:test/report/cucumber_report.json"),
        snippets = SnippetType.CAMELCASE
)
public class Testrunner {

    @AfterClass
    public static void end(){
        try{
            System.out.println("GENERANDO REPORTE");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("REPORTE GENERADO CORRECTAMENTE");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
