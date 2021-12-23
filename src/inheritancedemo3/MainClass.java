package inheritancedemo3;

public class MainClass extends Shubhangi {
//	  void s4() {//same method of shubhangi & main class (can't reduce the visibility on child class
//      System.out.println("I am s4 from MainClass ");
//	}

	public static void main(String[] args) {
//		Shubhangi S = new Sudhakar();// When we using parent reference & object of child class that time we can call
//										// parent class method only(here we see parent & object class method only)
//		S.s1();
//		S.s2();
//		S.s4();
//		MainClass m = new MainClass();
//		m.s1();
//		m.s2();
//      m.s4();	//when we take same method of both class that time execute the method of above class(not parent class)
		MainClass m = (MainClass) new Shubhangi();// When we use Child reference variable & parent object that time
													// throw the ClassCastException
		m.s1();
		m.s2();
		m.s4();
	}

}
