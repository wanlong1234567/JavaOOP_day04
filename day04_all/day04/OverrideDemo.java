package oo.day04;
//��д����ʾ
public class OverrideDemo {
	public static void main(String[] args) {
		/*
		Aoo o1 = new Aoo();
		o1.show(); //����show
		Boo o2 = new Boo();
		o2.show(); //����show
		*/
		
		Aoo o3 = new Boo(); //��������
		o3.show(); //����show
	}
}

/*
 * ��ѭ"��ͬ��Сһ��"ԭ��:
 * 1)��ͬ:
 *   1.1)����������ͬ
 *   1.2)�����б���ͬ
 * 2)��С:
 *   2.1)���෽���ķ���ֵ����С�ڻ���ڸ����
 *       2.1.1)voidʱ��������ͬ
 *       2.1.2)��������ʱ��������ͬ
 *       2.1.3)��������ʱ��С�ڻ����
 *   2.2)�����׳����쳣С�ڻ���ڸ����--------�쳣֮��
 * 3)һ��:
 *   3.1)���෽���ķ���Ȩ�޴��ڻ���ڸ����
 */

//���������С
class Coo{
	void show(){}
	double test(){return 0.0;}
	Doo sayHi(){return null;}
	public Coo say(){return null;}
}
class Doo extends Coo{
	//int show(){return 1;} //�������voidʱ�������
	//int test(){return 0;} //������󣬻�������ʱ�������
	//Coo sayHi(){return null;} //���������������ʱ����С�ڻ����
	public Doo say(){return null;} //��������ʱ��С��
}








class Aoo{
	void show(){
		System.out.println("����show");
	}
}
class Boo extends Aoo{
	void show(){
		super.show(); //���ø����show����
		System.out.println("����show");
	}
}


















