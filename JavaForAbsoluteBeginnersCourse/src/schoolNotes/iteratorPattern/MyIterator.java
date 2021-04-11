package schoolNotes.iteratorPattern;

import schoolNotes.iteratorPattern.IMyIterator;
import schoolNotes.iteratorPattern.MyArray;

public class MyIterator implements IMyIterator {
    private MyArray arr;
    private int indexPointer;
    public MyIterator(MyArray arr) {
        this.arr=arr;
        indexPointer = 0;
    }


    @Override
    public boolean hasMore(){
        int lastIndex = this.arr.getArr().length-1;
        return indexPointer<=lastIndex;

    }

    @Override
    public Integer getNext(){
        return this.arr.getArr()[indexPointer++];
    }

}
