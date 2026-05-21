public String getShortenedName(){
	String temp = username; 
	while(temp.indexOf("-")){
		int num = temp.indexOf("-");
		temp = temp.substring(0, num-1) + tmep.substring(num+1);
	}
	return temp;	
}
