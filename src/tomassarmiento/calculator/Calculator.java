package tomassarmiento.calculator;

import java.util.ArrayList;

public class Calculator {
	ArrayList<Double> num = new ArrayList<Double>();
	ArrayList<Character> operations = new ArrayList<Character>();
	private Double var;
	
	public Calculator() {}
	
	public void addNum(Double n) {
		num.add(n);
	}
	
	public void addOpt(Character c) {
		operations.add(c);
	}
	
	public Double performResult() {
		operations.add('=');
		if(num.size()>=2) {
			while(operations.size()>1) {
				for(int i=0; i<operations.size();i++) {
						if(operations.get(i)=='*') {
							var = num.get(i)*num.get(i+1);
							System.out.println("1, "+i);
							System.out.println(""+num.get(i)+"*"+num.get(i+1)+"");
							num.set(i, var);
							num.remove(i+1);
							operations.remove(i);

						}
						if(operations.get(i)=='/'){
							var = num.get(i)/num.get(i+1);
							System.out.println("2, "+i);
							System.out.println(""+num.get(i)+"/"+num.get(i+1)+"");
							num.set(i, var);
							num.remove(i+1);
							operations.remove(i);
						}
				}
				
				for(int i=0; i<operations.size();i++) {
					if(operations.get(i)=='+') {
						var = num.get(i)+num.get(i+1);
						System.out.println("3, "+i);
						System.out.println(""+num.get(i)+"+"+num.get(i+1)+"");
						num.set(i, var);
						num.remove(i+1);
						operations.remove(i);

					}
					if(operations.get(i)=='-') {
						var = num.get(i)-num.get(i+1);
						System.out.println("4, "+i);
						System.out.println(""+num.get(i)+"-"+num.get(i+1)+"");
						num.set(i, var);
						num.remove(i+1);
						operations.remove(i);

					}
				}
			}
			System.out.println("Terminado: "+num.get(0));
		}
		return num.get(0);
	}
}
