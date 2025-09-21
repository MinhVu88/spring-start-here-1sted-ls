import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.springstarthere.models.Comment;
import com.springstarthere.proxies.NotificationProxy;
import com.springstarthere.repositories.CommentRepository;
import com.springstarthere.services.CommentService;

public class CommentServiceTest {
  @Test
  @DisplayName("CommentService correctly delegates responsibilities to repo & proxy objects")
  void testCommentService() {
    var comment = mock(Comment.class);
    var commentRepo = mock(CommentRepository.class);
    var notification = mock(NotificationProxy.class);

    var commentService = new CommentService(commentRepo, notification);
    commentService.publishComment(comment);

    verify(commentRepo).storeComment(comment);
    verify(notification).sendNotification(comment);
  }          
}
