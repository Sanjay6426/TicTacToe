package Game;

class TicTacToe{
	static char[][] board;
	
	public TicTacToe() {             //Constructor
		board=new char[3][3];
		initBoard();
	}
void initBoard() {
	for (int i=0; i<board.length;i++) {
		for(int j=0; j<board[i].length;j++) {
			board[i][j]=' ';
			
		}
	}
}

static void dispBoard() {
	
	System.out.println("--------------");
	for (int i=0; i<board.length;i++) {
		System.out.print(" | ");
		for(int j=0; j<board[i].length;j++) {
			System.out.print(board[i][j] + " | "); 	
		}
		System.out.println();
		System.out.println("--------------");
//		System.out.println("---------------------------");		
	}
	
}

static void placeMark(int row, int col, char mark) {
if (row>=0 && row<=2 && col>=0 && col<=2) {
	board[row][col]=mark;
}
else {
	System.out.println("Wrong Input");
}
}

static boolean checkColWin() {
	for (int j=0; j<=2;j++) {
		 if( board[0][j] !=' ' && board[0][j]==board[1][j] && board[1][j]==board[2][j]) {
			return true;
		}
	}
	return false;	
}

static boolean checkRowWin() {
	for(int i=0; i<=2; i++) {
		if(board[i][0] !=' ' && board[i][0]==board[i][1]  && board[i][1]==board[i][2]) {
			return true;
		}
	}
	return false;
}

static boolean checkDaiWin() {

			if (board[0][0]!=' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2] ||board[0][2]!=' ' &&  board[0][2]==board[1][1] && board[1][1]==board[2][0]) {
				return true;
		}		
			else{
				return false;
			}
}
}












  






public class LaunchGame {

	public static void main(String[] args) {
		TicTacToe p=new TicTacToe();
//		p.dispBoard();
//		TicTacToe.placeMark(2, 0, 'X');
//		TicTacToe.placeMark(2, 2, 'X');
//		TicTacToe.placeMark(1, 1, 'X');
//		TicTacToe.placeMark(0, 2, 'O');
//		p.dispBoard();
//		System.out.println(p.checkDaiWin()); 
	
	HumanPlayer p1=new HumanPlayer("Rajath", 'X');
	HumanPlayer p2=new HumanPlayer("Nivi", '0');
	
	HumanPlayer cp;
	cp=p1;
	
while(true) {
	System.out.println(cp.name + " move");
	cp.makemove();
	TicTacToe.dispBoard();
	if (TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDaiWin()) {
		System.out.println(cp.name + " Won");
		break;
	}
	else {
		if(cp==p1) {
			cp=p2;	
		}
		else {
			cp=p1;
		}
	}
}
	}

}
