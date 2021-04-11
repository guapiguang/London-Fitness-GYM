package team.gym.Service;

import team.gym.Beans.Video;
import java.util.List;

public interface VideoService {

    List<Video> getAllVideoList();

    List<Video> getVideoListByType(String type);

    List<Video> getVideoListByTrainer(String trainer);
}
