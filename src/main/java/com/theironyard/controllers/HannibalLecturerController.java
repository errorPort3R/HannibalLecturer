//package com.theironyard.controllers;
//
//import com.theironyard.entities.Lecturer;
//import com.theironyard.entities.Review;
//import com.theironyard.services.LecturerRepository;
//import com.theironyard.services.ReviewRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.annotation.PostConstruct;
//import javax.servlet.http.HttpSession;
//import java.sql.SQLException;
//
///**
// * Created by jeffryporter on 7/1/16.
// */
//
//
//
//@Controller
//public class HannibalLecturerController
//{
//
//    @Autowired
//    LecturerRepository lecturers;
//
//    @Autowired
//    ReviewRepository reviews;
//
//
//    @RequestMapping(path = "/lecturers", method = RequestMethod.POST)
//    public String createLecturer(Model model, String name, String topic, String image)
//    {
//        Lecturer lecturer = new Lecturer(name, topic, image);
//        lecturers.save(lecturer);
//        return "redirect:/";
//    }
//
//    @RequestMapping(path = "/reviews", method = RequestMethod.POST)
//    public String createReview(Model model, String author, String text, String isGood, int lecturerId)
//    {
//        boolean isGoodBool = false;
//        if (isGood.equals("on"))
//        {
//            isGoodBool = true;
//        }
//        Lecturer lecturer = lecturers.findOne(lecturerId);
//
//        Review review = new Review(author, text, isGoodBool, lecturer);
//        reviews.save(review);
//        return "redirect:/";
//    }
//}
