package kr.co.himedia.constructor05;
//다음에 해당되는 객체를 구현하고 해당 값들을 출력하시오.
// 키가 185이고 몸무게가 85키로인 남성이 있습니다. 이름은 이순신이고 나이는 40세 입니다. 
public class Person {
	
	public int key;
	public int weight;
	public String gender;
	public String name;
	public int age;
	
	public void showInfo() {
		System.out.println("키가"+this.key+"이고 몸무게가"+this.weight+"킬로인"+this.gender+"이 있습니다.");
		System.out.println("이름은 "+this.name+" 나이는 "+this.age+"세 입니다.");
	}
	
	@Override
	public String toString() {
		return "Person [key=" + key + ", weight=" + weight + ", gender=" + gender + ", name=" + name + ", age=" + age
				+ "]";
	}
	
	
	

	
	
	

}
