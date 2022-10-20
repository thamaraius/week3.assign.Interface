package Week3.Day2;

public  class Automation implements TestTool {

	public static void main(String[] args) {
		
		
		
		Language obj=new MultiLanguage();
		obj.ruby();
		obj.javaScript();
		obj.Java();
		
		
		TestTool obj1=new Automation();
		obj1.Selenium();
		

	}

	public void Selenium() {
		System.out.println("SELENIUM");
		
	}

	

}
