package team.gym.Service.Impl;

import org.springframework.stereotype.Service;
import team.gym.Beans.Video;
import team.gym.Service.VideoService;

import java.util.List;
@Service
// TODO 待实现
public class VideoServiceImpl implements VideoService {
    @Override
    public List<Video> getAllVideoList() {
        return null;
    }

    @Override
    public List<Video> getVideoListByType(String type) {
        return null;
    }

    @Override
    public List<Video> getVideoListByTrainer(String trainer) {
        return null;
    }
}
