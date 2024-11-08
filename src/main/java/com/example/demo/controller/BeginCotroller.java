package com.example.demo.controller;

import com.example.demo.controller.response.PrincipalDto;
import com.example.demo.dto.LoginDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
@SessionAttributes("user")
public class BeginCotroller {

    // 기본 페이지
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Welcome to the main page!");
        return "main";  // main.html 뷰를 반환
    }

    // 정보 페이지
    @GetMapping("/info/staff")
    public String info(Model model) {
        model.addAttribute("staffInfo", "This is the staff page.");
        return "info";  // info.html 뷰를 반환
    }

    // 도서관 페이지 (library.html)
    @GetMapping("/library")
    public String library(Model model) {
        model.addAttribute("libraryInfo", "Welcome to the library!");
        return "library";  // library.html 뷰를 반환
    }
}


