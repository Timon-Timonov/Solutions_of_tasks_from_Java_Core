package tasksByBook.lesson17.task_68byBook;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstrBuilder<P extends Person> {

    protected List<P> list = new ArrayList<>();


    public abstract P buildInstance(String line) throws LineException;

    public List getList() {
        return list;
    }
}
