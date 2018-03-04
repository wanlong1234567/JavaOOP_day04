package oo.day04;
//�ĸ�ƴ��
public class Tetromino {
	Cell[] cells;
	Tetromino(){
		cells = new Cell[4];
	}
	
	void drop(){
		for(int i=0;i<this.cells.length;i++){
			this.cells[i].row++;
		}
	}
	void moveLeft(){
		for(int i=0;i<cells.length;i++){
			cells[i].col--;
		}
	}
	void moveRight(){
		for(int i=0;i<cells.length;i++){
			cells[i].col++;
		}
	}
	void print(){ //���4�����ӵ��кź��к�
		for(int i=0;i<cells.length;i++){
			String str = cells[i].getCellInfo();
			System.out.println(str);
		}
	}
}













