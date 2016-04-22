import org.junit.*;
import static org.junit.Assert.*;

public class VowelReplacementTest {

  @Test
  public void convertString_ReceivesInputWithNothingToReplace_String() {
    VowelReplacement newReplacement = new VowelReplacement();
    assertEquals("grrzl", newReplacement.replace("grrzl"));
  }

  // @Test
  // public void convertString_ReceivesInputWithNothingToReplace_String() {
  //   vowelReplacement newReplacement = new vowelReplacement();
  //   assertEquals("grrzl", newReplacement.replace("grrzl"));
  // }
}
