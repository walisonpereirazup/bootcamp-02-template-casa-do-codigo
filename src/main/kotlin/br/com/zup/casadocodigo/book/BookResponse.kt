package br.com.zup.casadocodigo.book

import br.com.zup.casadocodigo.author.Author
import br.com.zup.casadocodigo.category.Category
import java.math.BigDecimal
import java.time.LocalDate

class BookResponse(
        val id: Long?,
        val title: String,
        val abstract: String,
        val summary: String,
        val price: BigDecimal,
        val pages: Int,
        val isbn: String,
        val publishedAt: LocalDate,
        val category: Category,
        val author: Author
) {
    constructor(model: Book) : this(
            model.id,
            model.title,
            model.abstract,
            model.summary,
            model.price,
            model.pages,
            model.isbn,
            model.publishedAt,
            model.category,
            model.author
    )
}
