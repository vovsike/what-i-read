package vovsike.impl.createBook;

public interface CreateBookService {

    void createBook(CreateBook createBook) throws BookAlreadyExists;

    void createAndAssignBook(CreateBook createBook, Long userId);
}
