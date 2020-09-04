package com.claroinvestments.bsestarmf;

public class BseUtils {
	private static final long LIMIT = 10000000000L;
	private static long last = 0;

	public static String getUniqueRefNo() {
	  // 10 digits.
	  long id = System.currentTimeMillis() % LIMIT;
	  if ( id <= last ) {
	    id = (last + 1) % LIMIT;
	  }
	  last = id;
	  return Long.toString(last = id);
	}

}
