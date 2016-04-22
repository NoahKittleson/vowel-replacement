
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Enter a Phrase");
  }

  @Test
  public void replacesVowels() {
    goTo("http://localhost:4567");
    fill("#phrase").with("This Is A Sequoia");
    submit(".btn");
    assertThat(pageSource()).contains("Th-s -s - S-q----");
  }

  @Test
  public void replacesVowelsAndGuesses() {
    goTo("http://localhost:4567");
    fill("#phrase").with("This Is A Sequoia");
    submit(".btn");
    fill("#guess").with("This Is A Sequoia");
    assertThat(pageSource()).contains("true");
  }
}
