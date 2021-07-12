package day1_Programs;

class Addition {
	public int add(int a, int b) {
		return (a+b);
	}
}

class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj = new Addition();
		int res = obj.add(10, 20);    //invoking method
		System.out.println("Result is: "+res);
		System.out.println("Result of 50 and 60 is "+obj.add(50, 60));
	}

}
