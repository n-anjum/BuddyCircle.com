package net.traineeproject.therap.services;

import net.traineeproject.therap.domain.User;
import net.traineeproject.therap.domain.WallPost;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: anjum
 * Date: 12/3/12
 * Time: 3:28 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PostService {
    public void saveNewPost(WallPost wallPost);
//    public List<PostModel> getPosts(User user);
    public List<WallPost> getPosts(User user);

    WallPost getPost(int id);

    void deletePost(WallPost post);
}
