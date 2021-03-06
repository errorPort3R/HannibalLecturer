package com.theironyard.controllers;

import com.theironyard.entities.Lecturer;
import com.theironyard.entities.Review;
import com.theironyard.services.LecturerRepository;
import com.theironyard.services.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by jeffryporter on 7/1/16.
 */

@RestController
public class HannibalLecturerRestController
{
    @Autowired
    LecturerRepository lecturers;

    @Autowired
    ReviewRepository reviews;

    @RequestMapping(path = "/lecturers", method = RequestMethod.GET)
    public Iterable<Lecturer> showLecturers()
    {
        return lecturers.findAll();
    }

    @RequestMapping(path = "/reviews", method = RequestMethod.GET)
    public Iterable<Review> showReviews(Model model, int lecturerId)
    {
        Lecturer lecturer = lecturers.findOne(lecturerId);
        return reviews.findByLecturer(lecturer);
    }

    @RequestMapping(path = "/lecturers", method = RequestMethod.POST)
    public String createLecturer(@RequestBody Lecturer lecturer)
    {
        lecturers.save(lecturer);
        return "redirect:/";
    }

    @RequestMapping(path = "/reviews", method = RequestMethod.POST)
    public String createReview(@RequestBody Review review)
    {

        reviews.save(review);
        return "redirect:/";
    }

}
