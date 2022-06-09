
public class Human {
	public String name; // メンバー変数
	public int age; //　メンバー変数

	// 引数なしのコンストラクタ
	public Human() {
		name = "山田孝之";
		age = 40;
	}
    // 引数2つのコンストラクタ
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
