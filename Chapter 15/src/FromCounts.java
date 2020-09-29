/*
 * Write a method called fromCounts that constructs and returns a new ArrayIntList of values given an existing ArrayIntList of counts. 
 * Assume that the ArrayIntList that is passed as a parameter stores a sequence of integer pairs that each indicate a count and a number. 
 * For example, suppose that an ArrayIntList called list stores [5, 2, 2, -5, 4, 3, 2, 4, 1, 1, 1, 0, 2, 17]. 
 * We will interpret this sequence of pairs to mean that you have 5 occurrences of 2, followed by two occurrences of -5 followed by 4 occurrences of 3, 
 * and so on. So the call of:

 ArrayIntList list2 = list.fromCounts();
            
should cause the variable list2 to store [2, 2, 2, 2, 2, -5, -5, 3, 3, 3, 3, 4, 4, 1, 0, 17, 17].
 */
public ArrayIntList fromCounts(){
    int num=0;
    int a=1;
    ArrayIntList list = new ArrayIntList();
    for(int i=0;i<size;i++){
        
           int rep=elementData[num];
        
        for(int j=0; j<rep; j++){
                list.add(elementData[a]);
            }
        num+=2;
        a+=2;
        
        
        
    }
                     
    
    return list;
                
            
}
