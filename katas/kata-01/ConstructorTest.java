class InitTest {
	InitTest() {
		System.out.println("Init field");
	}
}

class BaseTest {
	public BaseTest() {
		System.out.println("Hello from super constructor");
	}
}

public class ConstructorTest extends BaseTest{
	{
		System.out.println("Static block");
	}

	InitTest it = new InitTest();

	public ConstructorTest() {
//		super();
		System.out.println("Inside  constructor");
	}

	public static void main(String[] args) {
		ConstructorTest t = new ConstructorTest	();
	}
}
