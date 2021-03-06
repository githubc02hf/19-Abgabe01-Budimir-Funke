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
  
  @Override
  	public int sum() {
  		int sum = 0;
  		for (int element: this.values) {
  			sum += element;
  		}
  		return sum;
  	}
  
}
