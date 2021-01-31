package springmvcjson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springmvcjson.bean.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class BookController {

    @ResponseBody
    @RequestMapping("/book")
    public Book getBookById() {
        return new Book(1, "西游记", "吴承恩", new Date());
    }

    @ResponseBody
    @RequestMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        List<Book> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Book(i, "书本" + i, "作者" + i, new Date()));
        }
        return list;
    }

    @ResponseBody
    @RequestMapping("/addBook")
    public void addBook(@RequestBody Book book) {
        System.out.println(book);
    }


    @ResponseBody
    @GetMapping("/book/{id}")
    public Book book(@PathVariable Integer id) {
        return new Book(id, "西游记", "吴承恩", new Date());
    }


}
