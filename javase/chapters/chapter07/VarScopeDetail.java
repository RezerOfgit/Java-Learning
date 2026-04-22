public class VarScopeDetail{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.say();
		p1.say(2);
	}
}
class Person{
	String name = "jack";
	public void say(){
		System.out.println("say(2) name =" + name);
		String name = "king";
		System.out.println("say(1) name =" + name);

	}
	public void say(int num){
		System.out.println("say(2) name =" + name);
		String name = "king";
		System.out.println("say(1) name =" + name);

	}
	//System.out.println("say(1) name =" + name);
}