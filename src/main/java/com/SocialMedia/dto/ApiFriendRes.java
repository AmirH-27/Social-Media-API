package com.SocialMedia.dto;

import com.SocialMedia.entity.Friend;
import com.SocialMedia.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiFriendRes {
    User user;
    int numberOfFriends;
    List<User> friends;
    Pageable pageable;
    int total_pages;
}
