package oo.day04;
//��д�����ص��������ʾ
public class OverrideOverloadDemo {
	public static void main(String[] args) {
		Goo goo = new Goo();
		Eoo o = new Foo();
		goo.test(o); //���ؿ����õ�����(Eoo)
	}
}
class Goo{
	void test(Eoo o){
		System.out.println("���Ͳ���");
		o.show(); //��д�����������(Foo)
	}
	void test(Foo o){
		System.out.println("���Ͳ���");
		o.show();
	}
}
class Eoo{
	void show(){
		System.out.println("����show");
	}
}
class Foo extends Eoo{
	void show(){
		System.out.println("����show");
	}
}






















