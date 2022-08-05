import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class DeleteDuplicate {
    public static <T> Set<T> createDuplicateCollection(Collection<T> collection){
        return new TreeSet<>(collection);
    }
}
