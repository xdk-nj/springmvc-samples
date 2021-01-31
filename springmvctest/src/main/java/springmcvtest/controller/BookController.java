package springmcvtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springmcvtest.bean.Book;

@Controller
public class BookController {

    @RequestMapping("/book")
    public String addBook() {
        return "addbook";
    }

//    @RequestMapping("/doAdd")
//    @ResponseBody
//    public void doAdd(
//            @RequestParam(name = "name", defaultValue = "三国", required = true) String bookname,
//            String author, Double price, Boolean isPublic) {
//        System.out.println(bookname);
//        System.out.println(author);
//        System.out.println(price);
//        System.out.println(isPublic);
//    }

    @RequestMapping("/doAdd")
    @ResponseBody
    public void doAdd(Book book) {
        System.out.println(book);
    }
}
