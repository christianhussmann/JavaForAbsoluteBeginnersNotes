package schoolNotes.iteratorPattern;

import schoolNotes.iteratorPattern.IMyIterator;

public interface IterableCollection {
    IMyIterator createIterator();
}
