package com.HUBOT.HUBOT.Schedual;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScheduleRepository extends MongoRepository<Schedule, String> {
    Schedule findByStudentId(String studentId);
    Schedule findByStudentIdAndSemesterAndYear(String studentId, int semester, int year);

}