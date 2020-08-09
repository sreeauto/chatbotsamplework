package com.mini.workshop.util;

import java.nio.charset.Charset;

public class EncodingUtils {

  public static final String UTF_8 = "UTF-8";

  public static byte[] encodeHex(final byte[] data) {
    if (data == null)
      throw new NullPointerException("Parameter 'data' cannot be null.");

    final char[] toDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    final int l = data.length;
    final char[] out = new char[l << 1];
    for (int i = 0, j = 0; i < l; i++) {
      out[j++] = toDigits[(0xF0 & data[i]) >>> 4];
      out[j++] = toDigits[0x0F & data[i]];
    }

    return new String(out).getBytes(Charset.forName(UTF_8));
  }

}
