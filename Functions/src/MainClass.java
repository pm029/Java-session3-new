
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int salary = 20000;
		Maths M=new Maths();
		M.add(5, 5);; //this add is not using the value
		
		//this will give the value back. this is the function and we need to use it 
		net=salary-M.tax(salary);
		
		System.out.println("Tax calculated is "+M.tax(salary));
		System.out.println("Net salart is "+net);

}
}