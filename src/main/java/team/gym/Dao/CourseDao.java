package team.gym.Dao;

import team.gym.Beans.Course;

public interface CourseDao {

    /** add a course to the course list of specific customer in customers.xml
     *
     * @param account customer account
     * @param course the course to be added
     * @return
     */
    int addCustomerCourse(String account, Course course);

    /**add a course to the course list of specific trainer in trainers.xml
     *
     * @param account trainer account
     * @param course the course to be added
     * @return
     */
    int addTrainerCourse(String account, Course course);
}
