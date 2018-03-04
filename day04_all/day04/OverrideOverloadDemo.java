package oo.day04;
//重写与重载的区别的演示
public class OverrideOverloadDemo {
	public static void main(String[] args) {
		Goo goo = new Goo();
		Eoo o = new Foo();
		goo.test(o); //重载看引用的类型(Eoo)
	}
}
class Goo{
	void test(Eoo o){
		System.out.println("父型参数");
		o.show(); //重写看对象的类型(Foo)
	}
	void test(Foo o){
		System.out.println("子型参数");
		o.show();
	}
}
class Eoo{
	void show(){
		System.out.println("父类show");
	}
}
class Foo extends Eoo{
	void show(){
		System.out.println("子类show");
	}
}






















