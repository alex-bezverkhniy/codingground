class ReverseString {

  public static String reverse(String src) {
    byte[] outArray = null;
    if (src != null && !src.isEmpty()) {
      byte[] array = src.getBytes();
      outArray = new byte[array.length];
      for(int i = 0, j = array.length-1; i < array.length;i++, j-- ) {
        outArray[i] = array[j];
      }
    }
    return outArray != null ? new String(outArray) : null;
  }

  public static String reverse2(String src) {
    if (src != null && !src.isEmpty() ) {
      byte[] array = src.getBytes();
      for(int i = 0, j = array.length-1; i != j; i++, j--) {
        byte tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
      }
      return new String(array); 
    }
    return null;
  }

  public static void main(String[] args) {
      String result = reverse("apple");
      System.out.println(result);
      assert result.equals("elppa") : "Expected \"elppa\"";
      result = reverse2("apple");
      System.out.println(result);
      assert result.equals("elppa") : "Expected \"elppa\"";
  }
}
