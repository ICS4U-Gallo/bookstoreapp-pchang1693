package controllers;

import com.google.inject.Inject;
import models.Book;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.Set;

import views.html.books.*;
import views.html.books.index;

public class BooksController extends Controller {

    @Inject
    FormFactory formFactory;

    // for all books
    public Result index(){
        Set<Book> books = Book.allBooks();
        return ok(index.render(books));
    }

    // to create book
    public Result create(){
        Form<Book> bookForm = formFactory.form(Book.class);
        return ok(create.render(bookForm));
    }

    // to save book
    public Result save(){

        return TODO;
    }

    public Result edit(Integer id){
        return TODO;
    }

    public Result update(){
        return TODO;
    }

    public Result destroy(Integer id){
        return TODO;
    }

    public Result show(Integer id){
        return TODO;
    }

}
