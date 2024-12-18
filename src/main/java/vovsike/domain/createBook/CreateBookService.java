package vovsike.domain.createBook;

public interface CreateBookService {

    void createBook(CreateBook createBook) throws BookAlreadyExists;

    void createAndAssignBook(CreateBook createBook, Long userId);
}
