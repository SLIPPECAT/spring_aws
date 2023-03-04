package com.example.spring_aws.domain.posts;

import com.example.spring_aws.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //이거 이해 제대로 안됨요 ㅋㅋ ㅠㅠ 왜 포스트에서 업데이트 해주징징 데이터에 바로 변동 주겠다 이것?
    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
