package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("")
    @ResponseBody
    public String mainPage() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'get' action = '/hello'>" +
                        "<label for='name'> Name: </label> " +
                        "<input type = 'text' name = 'name' />" +

                        "<label for='favorite1'> My favorite language: </label>" +
                        "<select name = 'favorite1' id = 'favorite1'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python>Python</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "</select>" +

                        "<label for='favorite2'> My second favorite language: </label>" +
                        "<select name = 'favorite2' id = 'favorite2'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python>Python</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "</select>" +

                        "<label for='favorite3'> My third favorite language: </label>" +
                        "<select name = 'favorite3' id = 'favorite3'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python>Python</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "</select>" +

                        "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }


    @GetMapping("test")
    @ResponseBody
    public String test() {
        return "test string";
    }

    @GetMapping("test2")
    @ResponseBody
    public String test2() {
        return "test string 2";
    }

}
