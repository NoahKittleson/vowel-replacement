public class VowelReplacement {
  public static String replace (String originalPhrase) {
    char[] phraseCharArray = originalPhrase.toCharArray();
    for (int index = 0; index < phraseCharArray.length; index++) {
        if (phraseCharArray[index] == 'a' || phraseCharArray[index] == 'e') {
          phraseCharArray[index] = '-';
        }
    }

    String finalPhrase = new String(phraseCharArray);
    return finalPhrase;
  }
}
