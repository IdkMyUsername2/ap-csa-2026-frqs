public int moreHistoryThanMathAbsences(){
	int total = 0;
	for(int i = 0; i < historyList.size(); i++){
		for(int z = 0; z < mathList.size(); z++){
			if(historyList.get(i).getStudentID().equals(mathList.get(z).getStudentID())){
				if(historyList.get(i).getAbsences() > mathList.get(z).getAbsences()){
					total ++;
				}
			}
		}
	}
	return total;


	
}
