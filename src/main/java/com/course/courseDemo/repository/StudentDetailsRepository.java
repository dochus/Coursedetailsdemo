package com.course.courseDemo.repository;

import com.course.courseDemo.domain.StudentDetailsFile;
import com.course.courseDemo.dto.StudentCourseDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetailsFile, UUID> {




}
