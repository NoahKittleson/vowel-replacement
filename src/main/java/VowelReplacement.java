public class VowelReplacement {
  public static String replace (String originalPhrase) {
    char[] phraseCharArray = originalPhrase.toCharArray();
    char[] vowelArray = {'a', 'e', 'i', 'o', 'u'};
    for (int index = 0; index < phraseCharArray.length; index++) {
      for (char vowel: vowelArray) {
        if (phraseCharArray[index] == vowel) {
          phraseCharArray[index] = '-';
        }
      }
    }

    String finalPhrase = new String(phraseCharArray);
    return finalPhrase;
  }
}
