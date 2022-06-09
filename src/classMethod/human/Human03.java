package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String profession;

	public Human03() {
		this.name = "yamada";
		this.age = 20;
		this.profession = "programmer";
	}


	public String getProfile() {
		return "he age" + this.age + ", he profession is" + this.profession;
	}

	public void greet(String friend) {
		if (friend == null) {
			System.out.println("挨拶する友達がわかりません!");
			return;
		}
		System.out.println(friend + "さん、こんにちは!!");
	}
}
