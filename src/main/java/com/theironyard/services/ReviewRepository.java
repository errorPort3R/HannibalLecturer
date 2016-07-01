package com.theironyard.services;

import com.theironyard.entities.Lecturer;
import com.theironyard.entities.Review;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jeffryporter on 7/1/16.
 */
public interface ReviewRepository extends CrudRepository<Review, Integer>
{
    public Iterable<Review> findByLecturer(Integer lecturerId);
}
