//going to call the word we are trying to insert "insertWord" for now



boolean isSorted = true;
for(int i = 0; i < list.size() - 1; i++) {
   // current String is > than the next one (if there are equal list is still sorted)
   if(list.get(i).compareToIgnoreCase(list.get(i + 1)) > 0) { 
       isSorted = false;
       break;
   }
}