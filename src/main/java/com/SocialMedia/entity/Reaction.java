package com.SocialMedia.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Reaction {
    @Id
    @GeneratedValue
    private int id;
    private ReactionType reactionType;
    @ManyToOne
    private User user;
    @ManyToOne
    private Post post;
}