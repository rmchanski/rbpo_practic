package com.rmdeal.shop.Controllers;

import com.rmdeal.shop.models.post;
import com.rmdeal.shop.repo.postRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class ListController {

    @Autowired
    private postRepository postRepository;
    @GetMapping("/list")
    public String listMain(Model model) {
        Iterable<post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "list";
    }
}
