package day9.Q2;

final public class Child extends Parent{
	
    public Child(int number) {
        
		super(number);
    	
	}

	@Override
    public void method1() {
		if(super.number>0 && super.number<=10) {
			System.out.println("Number variable is "+super.number);
		}
		else {
			System.out.println("Invalid Number");
		}
    	
    }
    
  
  
    
     @Override
    public void method3() {
    	 System.out.println("method3() of Child class");
    }
     
     public void method4() {
    	 System.out.println("method4() of Child class");
	}
}
