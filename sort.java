//going to call the word we are trying to insert "insertWord" for now

String word = "";

//boolean isSorted = true;
for(int i = 0; i < this.size(); i++) {
   // current String is > than the next one (if there are equal list is still sorted)
    int comparison = word.compareToIgnoreCase(this.getIndex(i) );
   if(comparison == 0) { 
       return i;
       
   }
   else if(comparison > 0){
   		this.add(word, i);
   		return i;
   	}
   	
   
}

this.getIndex.word    