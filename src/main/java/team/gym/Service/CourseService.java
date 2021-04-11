package team.gym.Service;

import team.gym.Beans.Course;

import java.util.List;

public interface CourseService {
    /** get the courses of a customer according to the account
     *
     * @param account
     * @return
     */
    List<Course> getCustomerCourses(String account);

    /**get the courses of a customer according to the account
     *
     * @param account
     * @return
     */
    List<Course> getTrainerCourses(String account);

    /** add a course recording, the recording will be added both in customers.xml and trainers.xml
     *
     * @param customer_account
     * @param trainer_account
     * @param course
     * @return
     */
    int addCourses(String customer_account, String trainer_account,Course course);
}
