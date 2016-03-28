package homework_Lesson28;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<Character>{

	  private Map map;

	    public ValueComparator(Map base) {
	        this.map = base;
	    }

		@Override
		public int compare(Character a, Character b) {
			  if ((Integer)map.get(a) >= (Integer)map.get(b)) {
		            return -1;
		        } else {
		            return 1;
		        } // returning 0 would merge keys
		}
}
