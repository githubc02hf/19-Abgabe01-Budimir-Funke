package at.fhj.iit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculatorImpl implements Calculator {
  private List<Integer> values = new ArrayList<Integer>();
  @Override
    public int getMaximum() {
      return values.get(values.indexOf(Collections.max(values)));
    }
  @Override
    public int getMinimum() {
	  return values.get(values.indexOf(Collections.min(values)));
    }
  @Override
    public void addValue(int value) {
	  this.values.add(value);
    }
  
  	public int sum() {
  		int sum = 0;
  		
  		for(int i = 0; i < values.size(); i++) {
  			sum += values.get(i);
  		}
  		
  		return sum;
  	}
  
}
