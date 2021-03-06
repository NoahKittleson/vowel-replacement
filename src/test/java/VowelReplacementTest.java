import org.junit.*;
import static org.junit.Assert.*;

public class VowelReplacementTest {

  @Test
  public void convertString_ReceivesInputWithNothingToReplace_String() {
    VowelReplacement newReplacement = new VowelReplacement();
    assertEquals("grrzl", newReplacement.replace("grrzl"));
  }

  @Test
  public void convertString_ReplacesOneLetterInOneLetterWord_String() {
    VowelReplacement newReplacement = new VowelReplacement();
    assertEquals("-", newReplacement.replace("a"));
  }

  @Test
  public void convertString_ReplacesMultipleAsInAWord_String() {
    VowelReplacement newReplacement = new VowelReplacement();
    assertEquals("b-n-n-", newReplacement.replace("banana"));
  }

  @Test
  public void convertString_ReplacesAsAndEs_String() {
    VowelReplacement newReplacement = new VowelReplacement();
    assertEquals("b-nn-d", newReplacement.replace("banned"));
  }

  @Test
  public void convertString_ReplacesAllVowelsButNotY_String() {
    VowelReplacement newReplacement = new VowelReplacement();
    assertEquals("s-q----", newReplacement.replace("sequoia"));
  }

  @Test
  public void convertString_ReplacesUpperAndLowerCaseVowels_String() {
    VowelReplacement newReplacement = new VowelReplacement();
    assertEquals("-b--t -m-t", newReplacement.replace("About Emit"));
  }
}
