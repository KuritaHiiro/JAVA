
public class ClassMethod01 {
  public static void main(String[] args) {
	  Human yamada = new Human(); //引数なしのコンストラクタを用いて、Humanクラスのインスタンスを生成
	  System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

	  Human sato = new Human("佐藤",25); // 引数2つのコンストラクタを用いて、Humanクラスのインスタンスを生成
	  System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
  }
}