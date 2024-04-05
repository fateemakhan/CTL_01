package Case_tools_assignments;
import java.util.Scanner;

public class SmartCalculator {
	static Scanner inp = new Scanner(System.in);
    double principal;
    double rate;
    int time;
    double[] numbers;
    double totalMarks;
    double marksObtained;
	public double number;
    
    

    public double calculateSimpleInterest() {
    	System.out.println("Simple Interest \n");
    	System.out.println("Enter the Principal Amount: ");
    	setPrincipal(inp.nextDouble());
    	System.out.println("Enter the Interest Rate: ");
    	setRate(inp.nextDouble());
    	System.out.println("enter the Time Taken(in years): ");
    	setTime(inp.nextInt());
        return (getPrincipal() * getRate() * getTime()) / 100;
    }
    
    public double calculateCompoundInterest() {
    	System.out.println("Compound Interest \n");
    	System.out.println("Enter the Principal Amount: ");
    	setPrincipal(inp.nextDouble());
    	System.out.println("Enter the Interest Rate: ");
    	setRate(inp.nextDouble());
    	System.out.println("enter the Time Taken(in years): ");
    	setTime(inp.nextInt());
        return getPrincipal() * Math.pow((1 + getRate() / 100), getTime()) - getPrincipal();
    }
   
    public double calculateMean() {
    	System.out.print("Enter the number of elements for mean calculation: ");
        int size = inp.nextInt();
         setNumbers(new double[size]);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            getNumbers()[i] = inp.nextDouble();
        }
    	
        double sum = 0;
        for (double number : getNumbers()) {
            sum += number;
        }
        return sum / getNumbers().length;
    }
    public double calculateFactorial(double number2) {
    	int fact = 1;
    	System.out.println("Enter num: ");
    	double number = inp.nextDouble();
    	for(int i = 1; i <= number;i++) {
    		fact = fact * i;
        }
    	return fact;
    }
    public double calculatePercentage() {
    	 System.out.print("Enter total marks: ");
          setTotalMarks(inp.nextDouble());
         System.out.print("Enter marks obtained: ");
          setMarksObtained(inp.nextDouble());
        return (getMarksObtained() / getTotalMarks()) * 100;
    }

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public double[] getNumbers() {
		return numbers;
	}

	public void setNumbers(double[] numbers) {
		this.numbers = numbers;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}

	public double getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(double marksObtained) {
		this.marksObtained = marksObtained;
	}


}
