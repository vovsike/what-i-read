package vovsike.book;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import vovsike.models.Book;

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA_CDI, injectionStrategy = InjectionStrategy.FIELD)
public abstract class BookMapper {

    public abstract BookEntity toEntity(Book book);

    public abstract BookFull toBook(BookEntity bookEntity);
}
