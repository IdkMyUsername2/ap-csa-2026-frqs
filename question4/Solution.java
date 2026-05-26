public int getPointsForRow(int targetRow){
	int total = board[targetRow][0].getPoints():
	String firstColor= board[targetRow][0].getColor();
	boolean bleh = true;
	for(int i = 1; i < board[targetRow].length; i++){
		total = board[targetRow][i].getPoints();
		if(! prevColor.equals(board[targetRow][i].getColor())){
			bleh = false;
		}
	}

	if(bleh){
		return total * 2;
	}

	return total;

	
}
