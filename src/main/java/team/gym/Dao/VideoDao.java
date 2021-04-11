package team.gym.Dao;

import team.gym.Beans.Video;

import java.util.List;

public interface VideoDao {

    /**get all videos
     *
     * @return the list of all videos
     */
    List<Video> getAllVideoList();
}
