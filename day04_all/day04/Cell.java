package oo.day04;
//������
public class Cell {
	//��Ա����
	int row; //�к�	
	int col; //�к�
	Cell(){
		this(0,0);
	}
	Cell(int n){
		this(n,n);
	}
	Cell(int row,int col){
		this.row = row;
		this.col = col;
	}
	
	//����
	void drop(){ //����1��
		row++;
	}
	void moveLeft(int n){ //����n��
		col-=n;
	}
	String getCellInfo(){ //��ȡ���ӵ��кź��к�
		return row+","+col;
	}

	void drop(int n){ //����n��
		row+=n;
	}
	void moveLeft(){ //����1��
		col--;
	}
	
}

















