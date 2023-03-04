package com.example.spring_aws.domain;

import com.example.spring_aws.domain.posts.Posts;
import com.example.spring_aws.domain.posts.PostsRepository;
import org.hibernate.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class PostsRepositoryTest {
    // save, findall 기능

    @Autowired
    PostsRepository postsrepository;

    @AfterEach
    public void cleanup() {
        postsrepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsrepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("ryuryu@naver.com")
                .build());

        //when
        List<Posts> postsList = postsrepository.findAll();

        //then
        Posts posts = postsList.get(0); //인덱스 0의 리스트 값을 가져다 준다는 건가?
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }

    @Test
    public void BaseTimeEntity_등록(){
        //given
        LocalDateTime now = LocalDateTime.of(2023,3,4,0,0,0);
        postsrepository.save(Posts.builder()
                .title("title")
                .content("content")
                .author("author")
                .build());
        //when
        List<Posts> postsList = postsrepository.findAll();

        //then
        Posts posts = postsList.get(0);
        System.out.println(">>>>>>>> createDate="+posts.getCreateDate()+", ModifiedDate="+posts.getModifiedDate());

        assertThat(posts.getCreateDate()).isAfter(now);
        assertThat(posts.getModifiedDate()).isAfter(now);
    }
}
