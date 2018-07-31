package five_collection.nine_utilIterator;

import java.util.Iterator;

public class ReadOnlyList<E> implements Iterable<E> {

    E[] array;

    public ReadOnlyList(E... array){
        this.array = array;
    }

    @Override
    public Iterator<E> iterator() {
        return new ReadOnlyIterator();
    }

    class ReadOnlyIterator implements Iterator<E> {
        int index = 0;

        public boolean hasNext() {
            return index < ReadOnlyList.this.array.length;
        }

        public E next(){
            E e = array[index];
            index++;
            return e;
        }
    }

}
