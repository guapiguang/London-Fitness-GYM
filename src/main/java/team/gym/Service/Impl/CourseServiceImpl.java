package team.gym.Service.Impl;

import team.gym.Beans.Course;
import team.gym.Service.CourseService;

import java.util.List;
// TODO 待完成
public class CourseServiceImpl implements CourseService {
    @Override
    public List<Course> getCustomerCourses(String account) {
        return null;
    }

    @Override
    public List<Course> getTrainerCourses(String account) {
        return null;
    }

    @Override
    public int addCourses(String customer_account, String trainer_account,Course course) {
        return 0;
    }
}
